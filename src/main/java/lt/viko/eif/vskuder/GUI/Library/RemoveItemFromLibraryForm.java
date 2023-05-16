package lt.viko.eif.vskuder.GUI.Library;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.RemoveItemFromLibraryRequest;
import lt.viko.eif.vskuder.client.RemoveItemFromLibraryResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RemoveItemFromLibraryForm {
    private JPanel RemoveItemFromLibraryPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton removeItemFromLibraryButton;
    private JFrame frame;
public RemoveItemFromLibraryForm() {
    frame = new JFrame("RemoveItemFromLibraryForm");
    frame.setContentPane(RemoveItemFromLibraryPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    removeItemFromLibraryButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            RemoveItemFromLibraryRequest request = new RemoveItemFromLibraryRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));
            request.setGameId(Integer.parseInt(textField2.getText()));

            RemoveItemFromLibraryResponse response = interactRest.removeItemFromLibrary(request);
            JOptionPane.showMessageDialog(null, response.getAnswer());
        }
    });
}
}
