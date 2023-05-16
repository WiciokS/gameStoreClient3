package lt.viko.eif.vskuder.GUI.Developer;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.CreateDeveloperRequest;
import lt.viko.eif.vskuder.client.CreateDeveloperResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddDeveloperForm {
    private JTextField textField1;
    private JButton addDeveloperButton;
    private JPanel AddDeveloperPanel;
    private JFrame frame;
public AddDeveloperForm() {
    frame = new JFrame("AddDeveloperForm");
    frame.setContentPane(AddDeveloperPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    addDeveloperButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            CreateDeveloperRequest createDeveloperRequest = new CreateDeveloperRequest();
            createDeveloperRequest.setDeveloperName(textField1.getText());

            CreateDeveloperResponse createDeveloperResponse = interactRest.createDeveloper(createDeveloperRequest);
            JOptionPane.showMessageDialog(null, createDeveloperResponse.getAnswer());
        }
    });
}
}
