package is.ru.TicTacToe;

import static spark.Spark.*;
import spark.utils.IOUtils;
import spark.utils.ResourceUtils;

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
								"</head> " +
								"<body> " +
									"<table> ";
			for(int i = 0; i<3; i++) {
				output += "<tr> ";
				for(int j = 0; j<3; j++) {
					output += "<td> <a href=/"  + (i*3 + j) + "> ";
					if(ttt.getValueAtPos(i*3 + j) == 0) {
						output += "<img src=\"/images/blank.png\" id=\"" + (i*3+j) + "\"> ";
					}
					else if(ttt.getValueAtPos(i*3 + j) == 1) {
						output += "<img src=\"/images/cross.png\" id=\"" + (i*3+j) + "\"> ";
					}
					else if(ttt.getValueAtPos(i*3 + j) == 2) {
						output += "<img src=\"/images/circle.png\" id=\"" + (i*3+j) + "\"> ";
					}
					
					output += "</a> </td>";
				}
				output += "</tr> ";
			}
			output += 		"</table> " +
						"</body> " +
					"</html> ";
			return output;
		});
		before("/:id", (req, res) -> {
			ttt.insert(Integer.parseInt(req.params(":id")));
			res.redirect("/");
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
