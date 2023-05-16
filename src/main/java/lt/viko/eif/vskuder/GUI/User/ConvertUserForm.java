package lt.viko.eif.vskuder.GUI.User;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.GetLibraryUserRequest;
import lt.viko.eif.vskuder.client.GetLibraryUserResponse;
import lt.viko.eif.vskuder.client.Library;
import lt.viko.eif.vskuder.util.Converter;
import lt.viko.eif.vskuder.util.JAXBTransformer;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConvertUserForm {
    private JPanel ConvertUserPanel;
    private JTextField textField1;
    private JButton converToPDFButton;
    private JButton convertToHTMLButton;
    private JFrame frame;

public ConvertUserForm() {
    frame = new JFrame("ConvertUserForm");
    frame.setContentPane(ConvertUserPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    converToPDFButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            GetLibraryUserRequest request = new GetLibraryUserRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));

            GetLibraryUserResponse response = interactRest.getLibraryUser(request);

            Library library = new Library();
            library.setUser(response.getUser());
            //add all games to library
            library.getGames().addAll(response.getGames());

            JAXBTransformer jaxbTransformer = new JAXBTransformer(Library.class);
            //Using Jaxbtransformer class to convert object to xml and print it
            jaxbTransformer.toXml(library, "java.xml");
            try {
                Converter converter = new Converter();
                converter.convertToPDF("java.xml", "toPDF.xsl", "user.pdf");
                JOptionPane.showMessageDialog(null, "Converted to PDF");
                //Open the pdf file
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "user.pdf");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error converting to PDF");
                ex.printStackTrace();
            }

        }
    });
    convertToHTMLButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            GetLibraryUserRequest request = new GetLibraryUserRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));

            GetLibraryUserResponse response = interactRest.getLibraryUser(request);

            Library library = new Library();
            library.setUser(response.getUser());
            //add all games to library
            library.getGames().addAll(response.getGames());

            JAXBTransformer jaxbTransformer = new JAXBTransformer(Library.class);
            //Using Jaxbtransformer class to convert object to xml and print it
            jaxbTransformer.toXml(library, "java.xml");

            Converter converter = new Converter();
            converter.convertToHTML("java.xml", "toHTML.xsl", "user.html");

            JOptionPane.showMessageDialog(null, "Converted to HTML");
        }
    });
}
}
