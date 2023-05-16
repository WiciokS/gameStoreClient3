package lt.viko.eif.vskuder.GUI.Library;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.AddItemToLibraryRequest;
import lt.viko.eif.vskuder.client.AddItemToLibraryResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddItemToLibraryForm {
    private JPanel AddItemToLibraryLabel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton addItemToLibraryButton;
    private JFrame frame;
public AddItemToLibraryForm() {
    frame = new JFrame("AddItemToLibraryForm");
    frame.setContentPane(AddItemToLibraryLabel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    addItemToLibraryButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            AddItemToLibraryRequest request = new AddItemToLibraryRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));
            request.setGameId(Integer.parseInt(textField2.getText()));

            AddItemToLibraryResponse response = interactRest.addItemToLibrary(request);
            JOptionPane.showMessageDialog(null, response.getAnswer());
        }
    });
}
}
