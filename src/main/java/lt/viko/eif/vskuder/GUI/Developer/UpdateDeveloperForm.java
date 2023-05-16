package lt.viko.eif.vskuder.GUI.Developer;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.UpdateDeveloperRequest;
import lt.viko.eif.vskuder.client.UpdateDeveloperResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateDeveloperForm {
    private JPanel UpdateDeveloperPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton updateDeveloperNameButton;
    private JFrame frame;

public UpdateDeveloperForm() {
    frame = new JFrame("UpdateDeveloperForm");
    frame.setContentPane(UpdateDeveloperPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    updateDeveloperNameButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            UpdateDeveloperRequest updateDeveloperRequest = new UpdateDeveloperRequest();
            updateDeveloperRequest.setDeveloperId(Integer.parseInt(textField1.getText()));
            updateDeveloperRequest.setDeveloperName(textField2.getText());

            UpdateDeveloperResponse updateDeveloperResponse = interactRest.updateDeveloper(updateDeveloperRequest);
            JOptionPane.showMessageDialog(null, updateDeveloperResponse.getAnswer());
        }
    });
}
}
