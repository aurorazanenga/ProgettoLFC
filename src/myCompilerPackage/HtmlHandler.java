package myCompilerPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HtmlHandler {
    private static final String ERROR_PREFIX = "Errore di sintassi: ";
    private List<String> errors;
    private StringBuilder generatedHtml;

    public HtmlHandler() {
        this.errors = new ArrayList<>();
        this.generatedHtml = new StringBuilder();
    }

    public List<String> getErrors() {
        return errors;
    }

    // Variabili CSS e HTML
    String bgColor = "\"grey\"";
    String fontType = "\"sans-serif\"";
    String marginTop = "\"0px\"";
    String marginBottom = "\"0px\"";
    String marginRight = "\"0px\"";
    String marginLeft = "\"0px\"";
    String textAlign = "\"center\"";
    String textLineHeight = "\"normal\"";
    int bookIndex = 0;
    String side_bar_content = "<div class = 'sidebar'>";

    private boolean hasTitle = false;
    private boolean hasAuthor = false;
    private boolean hasPlot = false;

    public static String removeFirstAndLastChar(String str) {
        if (str == null || str.length() < 2) {
            return "";
        }
        if (str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return str.substring(1, str.length() - 1);
        } else {
            return str;
        }
    }

    public void startHtml() {
        generatedHtml.append("<!DOCTYPE html>\n<html>\n<head>");
        generatedHtml.append("<title>Schede Libro</title>");
        generatedHtml.append("<link rel=\"stylesheet\" href=\"styles.css\">");
        generatedHtml.append("<style>")
                     .append(".page-break { page-break-before: always; }")
                     .append("</style>");
        generatedHtml.append("</head>\n<body>");
        generatedHtml.append("<div class=\"container\">");
    }

    public void endHtml() {
        closeCurrentPage();
        generatedHtml.append("<div class=\"content\">");
        generatedHtml.append("</div> <!-- end of content -->");
        generatedHtml.append("</div> <!-- end of container -->");
        generatedHtml.append(side_bar_content + "" + "</div>");
        generatedHtml.append("</body>\n</html>");
    }

    public void addCss() {
        // CSS is included by link, we don't need inline CSS
    }

    public void addPageTitle() {
        // Title is included in startHtml
    }

    public void setBgColor(String text) {
        bgColor = text;
    }

    public void setFontType(String text) {
        fontType = text;
    }

    public void setMarginTop(String text) {
        marginTop = text;
    }

    public void setMarginBottom(String text) {
        marginBottom = text;
    }

    public void setMarginLeft(String text) {
        marginLeft = text;
    }

    public void setMarginRight(String text) {
        marginRight = text;
    }

    public void setTextAlign(String text) {
        textAlign = text;
    }

    public void setTextLineHeight(String text) {
        textLineHeight = text;
    }

    public void addTitle(String text) {
        text = removeFirstAndLastChar(text);
        if (bookIndex > 0) {
            closeCurrentPage();
        }
        bookIndex++;
        generatedHtml.append("<div id=\"book" + bookIndex + "\" class=\"book-card\">");
        generatedHtml.append("<center><h1>" + text + "</h1></center>");
        side_bar_content += "\n <a href='#book" + bookIndex + "'> " + text + " </a> \n";
    }

    public void addAuthor(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<center><div>" + text + "</div></center><br>");
    }

    public void addGenre(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Genere</i>: " + text + "</div><br>");
    }

    public void addCompositionDate(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Data di composizione</i>: " + text + "</div><br>");
    }

    public void addPublicationYear(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Anno di pubblicazione</i>: " + text + "</div><br>");
    }

    public void addPublisher(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Editore</i>: " + text + "</div><br>");
    }

    public void addNarrator(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Narratore</i>: " + text + "</div><br>");
    }

    public void addPages(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Pagine</i>: " + text + "</div><br>");
    }

    public void addPrice(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Prezzo</i>: " + text + "</div><br>");
    }

    public void addStructure(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Struttura</i>: " + text + "</div><br>");
    }

    public void addPlot(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Trama</i>: " + text + "</div><br>");
    }

    public void addMessage(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Messaggio</i>: " + text + "</div><br>");
    }

    public void addCharacters(String text) {
        text = removeFirstAndLastChar(text);
        generatedHtml.append("<div><i>Personaggi</i>: " + text + "</div><br>");
    }

    private void closeCurrentPage() {
        generatedHtml.append("</div> <!-- end of book-card -->");
        generatedHtml.append("<div class=\"page-break\"></div>");
    }

    public void readCssFile(String cssFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(cssFilePath))) {
            StringBuilder cssBuilder = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                cssBuilder.append(line).append("\n");
            }
            addCss(cssBuilder.toString()); 
        } catch (IOException e) {
            errors.add(ERROR_PREFIX + "Impossibile leggere il file CSS: " + cssFilePath);
            e.printStackTrace();
        }
    }

    private void addCss(String cssContent) {
        generatedHtml.append("<style>\n")
                     .append(cssContent)
                     .append("\n</style>\n");
    }

    public void readTextFile(String textFilePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(textFilePath))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                processLine(line, lineNumber);
            }
            validateRequiredFields();
        } catch (IOException e) {
            errors.add(ERROR_PREFIX + "Impossibile leggere il file di testo: " + textFilePath);
            e.printStackTrace();
        }
    }

    private void validateRequiredFields() {
        if (!hasTitle) {
            errors.add(ERROR_PREFIX + "Manca il Titolo nel file di testo.");
        }
        if (!hasAuthor) {
            errors.add(ERROR_PREFIX + "Manca l'Autore nel file di testo.");
        }
        if (!hasPlot) {
            errors.add(ERROR_PREFIX + "Manca la Trama nel file di testo.");
        }
    }

    public String getGeneratedHtml() {
        return generatedHtml.toString();
    }

    private void processLine(String line, int lineNumber) {
        int colonIndex = line.indexOf(":");
        if (colonIndex != -1) {
            String label = line.substring(0, colonIndex).trim();
            String value = line.substring(colonIndex + 1).trim();

           
            int column = colonIndex + 1; 

            // Controlla se il valore inizia e finisce con virgolette
            if (value.startsWith("\"") && value.endsWith("\"")) {
                value = removeFirstAndLastChar(value);
                switch (label) {
                    case "Titolo":
                        addTitle(value);
                        hasTitle = true;
                        break;
                    case "Autore":
                        addAuthor(value);
                        hasAuthor = true;
                        break;
                    case "Genere":
                        addGenre(value);
                        break;
                    case "Data_di_composizione":
                        addCompositionDate(value);
                        break;
                    case "Anno_di_pubblicazione":
                        addPublicationYear(value);
                        break;
                    case "Editore":
                        addPublisher(value);
                        break;
                    case "Narratore":
                        addNarrator(value);
                        break;
                    case "Pagine":
                        addPages(value);
                        break;
                    case "Prezzo":
                        addPrice(value);
                        break;
                    case "Struttura":
                        addStructure(value);
                        break;
                    case "Trama":
                        addPlot(value);
                        hasPlot = true;
                        break;
                    case "Messaggio":
                        addMessage(value);
                        break;
                    case "Personaggi":
                        addCharacters(value);
                        break;
                    default:
                        errors.add(ERROR_PREFIX + "Linea non riconosciuta o malformata (riga " + lineNumber + ", colonna " + column + "): " + line);
                        break;
                }
            } else {
                errors.add(ERROR_PREFIX + "Formato non valido (riga " + lineNumber + ", colonna " + column + "): " + line);
            }
        } else {
            errors.add(ERROR_PREFIX + "Formato della linea non valido (riga " + lineNumber + ", colonna " + 1 + "): " + line);
        }
    }
}
