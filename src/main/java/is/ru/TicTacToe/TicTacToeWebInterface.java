package is.ru.TicTacToe;

import static spark.Spark.*;
import spark.utils.IOUtils;
import spark.utils.ResourceUtils;

public class TicTacToeWebInterface {
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		staticFileLocation("/public");
		get("/", (req, res) -> {
			String output = "<!DOCTYPE html 5> " +
							"<html> " +
								"<head> " +
								  "<link rel=\"stylesheet\" type=\"text/css\" href=\"/style/style.css\"> " +
								"</head> " +
								"<body> " +
									"<table> ";
			for(int i = 0; i<3; i++) {
				output += "<tr> ";
				for(int j = 0; j<3; j++) {
					output += "<td> <a href=/"  + (i*3 + j) + "> ";
					if(ttt.getValueAtPos(i*3 + j) == 0) {
						output += "<img src=\"/images/blank.png\"> ";
					}
					else if(ttt.getValueAtPos(i*3 + j) == 1) {
						output += "<img src=\"/images/cross.png\"> ";
					}
					else if(ttt.getValueAtPos(i*3 + j) == 2) {
						output += "<img src=\"/images/circle.png\"> ";
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
}
