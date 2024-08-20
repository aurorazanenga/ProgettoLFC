package myPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import myCompilerPackage.grammatica_completaLexer;
import myCompilerPackage.grammatica_completaParser;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ParserLauncher {
    public ParserLauncher(String txtFilePath, String cssFilePath, String htmlFilePath) {
        // Salva lo stream di output standard attuale
        PrintStream standardOut = System.out;
        
   
        try {
            String cssDestPath = Paths.get(htmlFilePath).getParent().resolve("styles.css").toString();
            Files.copy(Paths.get(cssFilePath), Paths.get(cssDestPath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File CSS copiato correttamente in: " + cssDestPath);
        } catch (IOException e) {
            System.err.println("Errore durante la copia del file CSS: " + e.getMessage());
        }
      

        try {
           
            OutputStream outputStream = new OutputStream() {
                private StringBuilder buffer = new StringBuilder();

                @Override
                public void write(int b) throws IOException {
                    buffer.append((char) b);
                }

                @Override
                public String toString() {
                    return buffer.toString();
                }
            };

            PrintStream customOut = new PrintStream(outputStream);
            System.setOut(customOut);

       
            grammatica_completaLexer lexer = new grammatica_completaLexer(new ANTLRReaderStream(new FileReader(txtFilePath)));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            grammatica_completaParser parser = new grammatica_completaParser(tokens);

            parser.startRule();

            System.setOut(standardOut);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(htmlFilePath))) {

                writer.write(outputStream.toString());
                System.out.println("File salvato correttamente in: " + htmlFilePath);
            } catch (IOException e) {
                System.err.println("Errore durante il salvataggio del file: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Parsing con ANTLR abortito");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String txtFilePath = "C:\\Users\\auror\\Desktop\\file\\file.txt";
        String cssFilePath = "C:\\Users\\auror\\Desktop\\file\\file.css";
        String htmlFilePath = "C:\\Users\\auror\\Desktop\\file\\file.html";

        new ParserLauncher(txtFilePath, cssFilePath, htmlFilePath);
    }
}
