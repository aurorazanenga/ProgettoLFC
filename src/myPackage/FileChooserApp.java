package myPackage;

import javax.swing.*;

import myCompilerPackage.HtmlHandler;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FileChooserApp {
    private JFrame frame;
    private JButton chooseFileButton;
    private JButton chooseCssButton;
    private JButton generateWebPageButton;
    private JButton saveFileButton;
    private JLabel fileLabel;
    private JLabel cssLabel;
    private JTextArea fileContentTextArea;
    private File selectedTxtFile;
    private File selectedCssFile;

    public FileChooserApp() {
        // Creazione della finestra principale
        frame = new JFrame("File Chooser App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Inizializzazione dei componenti
        chooseFileButton = new JButton("Choose TXT File");
        chooseFileButton.setFont(new Font("Arial", Font.PLAIN, 18));
        chooseFileButton.setBackground(new Color(70, 130, 180));
        chooseFileButton.setForeground(Color.WHITE);
        chooseFileButton.setFocusPainted(false);
        chooseFileButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        chooseCssButton = new JButton("Choose CSS File");
        chooseCssButton.setFont(new Font("Arial", Font.PLAIN, 18));
        chooseCssButton.setBackground(new Color(70, 130, 180));
        chooseCssButton.setForeground(Color.WHITE);
        chooseCssButton.setFocusPainted(false);
        chooseCssButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        generateWebPageButton = new JButton("Generate Web Page");
        generateWebPageButton.setFont(new Font("Arial", Font.PLAIN, 18));
        generateWebPageButton.setBackground(new Color(34, 139, 34));
        generateWebPageButton.setForeground(Color.WHITE);
        generateWebPageButton.setFocusPainted(false);
        generateWebPageButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        saveFileButton = new JButton("Save CSS File");
        saveFileButton.setFont(new Font("Arial", Font.PLAIN, 18));
        saveFileButton.setBackground(new Color(255, 165, 0));
        saveFileButton.setForeground(Color.WHITE);
        saveFileButton.setFocusPainted(false);
        saveFileButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));

        fileLabel = new JLabel("No TXT file selected");
        fileLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        fileLabel.setHorizontalAlignment(SwingConstants.CENTER);

        cssLabel = new JLabel("No CSS file selected");
        cssLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        cssLabel.setHorizontalAlignment(SwingConstants.CENTER);

        fileContentTextArea = new JTextArea();
        fileContentTextArea.setFont(new Font("Arial", Font.PLAIN, 14));
        fileContentTextArea.setLineWrap(true);
        fileContentTextArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(fileContentTextArea);

        // Layout manager
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Panel per i bottoni
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4, 20, 0));
        buttonPanel.add(chooseFileButton);
        buttonPanel.add(chooseCssButton);
        buttonPanel.add(generateWebPageButton);
        buttonPanel.add(saveFileButton);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(2, 1));
        labelPanel.add(fileLabel);
        labelPanel.add(cssLabel);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        panel.add(labelPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        frame.getContentPane().add(panel);

        // Listener per il bottone chooseFileButton
        chooseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    selectedTxtFile = fileChooser.getSelectedFile();
                    fileLabel.setText("Selected TXT file: " + selectedTxtFile.getName());
                }
            }
        });

     // Listener per il bottone chooseCssButton
        chooseCssButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    selectedCssFile = fileChooser.getSelectedFile();
                    cssLabel.setText("Selected CSS file: " + selectedCssFile.getName());

                    // Legge il contenuto del file CSS e lo visualizza nella JTextArea
                    try (BufferedReader reader = new BufferedReader(new FileReader(selectedCssFile))) {
                        fileContentTextArea.read(reader, null);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Error reading file", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });


        // Listener per il bottone saveFileButton
        saveFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedCssFile != null) {
                    // Salva il contenuto della JTextArea nel file CSS
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedCssFile))) {
                        fileContentTextArea.write(writer);
                        JOptionPane.showMessageDialog(frame, "CSS file saved successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Error saving file", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "No CSS file selected", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });

     // Listener per il bottone generateWebPageButton
        generateWebPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedTxtFile != null && selectedCssFile != null) {
                    // Salva il contenuto della JTextArea nel file CSS prima di generare la pagina web
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedCssFile))) {
                        fileContentTextArea.write(writer);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(frame, "Error saving CSS file", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setDialogTitle("Save HTML File");

                    // Imposta un filtro file per HTML
                    fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
                        @Override
                        public boolean accept(File f) {
                            return f.isDirectory() || f.getName().toLowerCase().endsWith(".html");
                        }

                        @Override
                        public String getDescription() {
                            return "HTML Files (*.html)";
                        }
                    });

                    int userSelection = fileChooser.showSaveDialog(frame);

                    if (userSelection == JFileChooser.APPROVE_OPTION) {
                        File htmlFile = fileChooser.getSelectedFile();
                        String txtFilePath = selectedTxtFile.getAbsolutePath();
                        String cssFilePath = selectedCssFile.getAbsolutePath();
                        String htmlFilePath = htmlFile.getAbsolutePath();

                        // Aggiungi estensione .html se manca
                        if (!htmlFilePath.toLowerCase().endsWith(".html")) {
                            htmlFilePath += ".html";
                        }

                        // Esegui il parsing e genera la pagina HTML
                        HtmlHandler htmlHandler = new HtmlHandler();
                        htmlHandler.startHtml();
                        htmlHandler.readCssFile(cssFilePath);
                        htmlHandler.readTextFile(txtFilePath);
                        htmlHandler.endHtml();

                        // Controlla se ci sono errori di sintassi
                        if (!htmlHandler.getErrors().isEmpty()) {
                            StringBuilder errorMessage = new StringBuilder("Sono stati riscontrati i seguenti errori:\n");
                            for (String error : htmlHandler.getErrors()) {
                                errorMessage.append(error).append("\n");
                            }
                            JOptionPane.showMessageDialog(frame, errorMessage.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            // Salva il documento HTML su file
                            try (BufferedWriter htmlWriter = new BufferedWriter(new FileWriter(htmlFilePath))) {
                                String generatedHtml = htmlHandler.getGeneratedHtml();
                                htmlWriter.write(generatedHtml);
                                JOptionPane.showMessageDialog(frame, "Web page generated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                frame.dispose();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(frame, "Error saving HTML file", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "No files selected", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select both TXT and CSS files", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FileChooserApp();
            }
        });
    }
}
