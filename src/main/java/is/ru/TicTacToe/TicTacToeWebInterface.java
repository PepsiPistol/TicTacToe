package is.ru.TicTacToe;

import static spark.Spark.*;
import spark.utils.IOUtils;
import spark.utils.ResourceUtils;

public class TicTacToeWebInterface {
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		staticFileLocation("/public");
		//get("/", (req, res) -> renderContent("index.html"));
		get("/0", (req, res) -> "index.html");
	}
	
	//Taken from 
	//https://stackoverflow.com/questions/33769455/java-spark-framework-use-straight-html-template
}
