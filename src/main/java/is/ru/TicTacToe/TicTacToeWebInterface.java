package is.ru.TicTacToe;

import static spark.Spark.*;
import spark.utils.IOUtils;
import spark.utils.ResourceUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

public class TicTacToeWebInterface {
	public static void main(String[] args) {
		port(getHerokuAssignedPort());
		TicTacToe ttt = new TicTacToe();
		staticFileLocation("/public");
		get("/", (req, res) -> {
			String output = "<!DOCTYPE html 5> " +
							"<html> " +
								"<head> " +
								  "<link rel=\"stylesheet\" type=\"text/css\" href=\"/style/style.css\"> " +
								  "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>" +
								  "<script src=\"/scripts/TicTacToeScript.js\"></script>" +
								  "<title>Tic-Cat-Dog</title>" +
								"</head> " +
								"<body> " +
									"<table> ";
			for(int i = 0; i<3; i++) {
				output += "<tr> ";
				for(int j = 0; j<3; j++) {
					output += "<td> <a href=/field/"  + (i*3 + j) + "> ";
					if(ttt.getValueAtPos(i*3 + j) == 0) {
						output += "<img src=\"/images/blank.png\" id=\"" + (i*3+j) + "\"> ";
					}
					else if(ttt.getValueAtPos(i*3 + j) == 1) {
						output += "<img src=\"/images/cat_regular.png\" id=\"" + (i*3+j) + "\"> ";
					}
					else if(ttt.getValueAtPos(i*3 + j) == 2) {
						output += "<img src=\"/images/dog_regular.png\" id=\"" + (i*3+j) + "\"> ";
					}
					
					output += "</a> </td>";
				}
				output += "</tr> ";
			}
			output += 		"</table> " +
							"<div class=\"winnerStatus\" id=\"status" + ttt.getGameStatus() + "\"></div>" +
							"<div id=\"replayButton\"></div>" + 
						"</body> " +
					"</html> ";
			return output;
		});
		
		before("/field/:id", (req, res) -> {
			ttt.insert(Integer.parseInt(req.params(":id")));
			res.redirect("/");
		});

		before("/reset", (req, res) -> {
			ttt.clear();
			res.redirect("/");
		});
		
		get("/designreport", (request, response) ->{
			try {
				Path path = Paths.get("build/resources/main/public/DesignReport.pdf");
				byte[] data = Files.readAllBytes(path);
		 
				HttpServletResponse httpServletResponse = response.raw();
				httpServletResponse.setContentType("application/pdf");
				httpServletResponse.addHeader("Content-Disposition", "inline; filename=DesignReport.pdf");
				httpServletResponse.getOutputStream().write(data);
				httpServletResponse.getOutputStream().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		});
		
		get("/administrationmanual", (request, response) ->{
			try {
				Path path = Paths.get("build/resources/main/public/AdministrationManual.pdf");
				byte[] data = Files.readAllBytes(path);
		 
				HttpServletResponse httpServletResponse = response.raw();
				httpServletResponse.setContentType("application/pdf");
				httpServletResponse.addHeader("Content-Disposition", "inline; filename=AdministrationManual.pdf");
				httpServletResponse.getOutputStream().write(data);
				httpServletResponse.getOutputStream().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		});
		
		get("/developermanual", (request, response) ->{
			try {
				Path path = Paths.get("build/resources/main/public/DeveloperManual.pdf");
				byte[] data = Files.readAllBytes(path);
		 
				HttpServletResponse httpServletResponse = response.raw();
				httpServletResponse.setContentType("application/pdf");
				httpServletResponse.addHeader("Content-Disposition", "inline; filename=DeveloperManual.pdf");
				httpServletResponse.getOutputStream().write(data);
				httpServletResponse.getOutputStream().close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "";
		});
	}
	static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
