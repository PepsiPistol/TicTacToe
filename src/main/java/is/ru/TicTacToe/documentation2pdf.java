package is.ru.TicTacToe;

import com.qkyrie.markdown2pdf.Markdown2PdfConverter;
import com.qkyrie.markdown2pdf.internal.exceptions.ConversionException;
import com.qkyrie.markdown2pdf.internal.exceptions.Markdown2PdfLogicException;
import com.qkyrie.markdown2pdf.internal.reading.SimpleStringMarkdown2PdfReader;
import com.qkyrie.markdown2pdf.internal.writing.SimpleFileMarkdown2PdfWriter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class documentation2pdf {
	public void basicExampleAsOneLiner(String inputFilename, String outputFilename) throws Markdown2PdfLogicException, ConversionException {
		String contents = "";
		try {
			contents = new String(Files.readAllBytes(Paths.get(inputFilename)));
		} catch(Exception e) {
		}
        Markdown2PdfConverter
                .newConverter()
                .readFrom(new SimpleStringMarkdown2PdfReader(contents))
                .writeTo(new SimpleFileMarkdown2PdfWriter(new File("build/resources/main/" + outputFilename)))
                .doIt();
    }
	public static void main(String args[]) {
		documentation2pdf md2pdf = new documentation2pdf();
		try {
			md2pdf.basicExampleAsOneLiner("docs/DesignReport.md", "public/DesignReport.pdf");
			md2pdf.basicExampleAsOneLiner("docs/DeveloperManual.md", "public/DeveloperManual.pdf");
			md2pdf.basicExampleAsOneLiner("docs/AdministrationManual.md", "public/AdministrationManual.pdf");
		} catch (Exception e) {
			
		}
	}
}