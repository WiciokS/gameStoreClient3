package lt.viko.eif.vskuder.GUI.User;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.UpdateUserRequest;
import lt.viko.eif.vskuder.client.UpdateUserResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateUserForm {
    private JPanel UpdateUserPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton updateUserButton;
    private JFrame frame;
public UpdateUserForm() {
    frame = new JFrame("UpdateUserForm");
    frame.setContentPane(UpdateUserPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    updateUserButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            UpdateUserRequest request = new UpdateUserRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));
            request.setUsername(textField2.getText());
            request.setPassword(textField3.getText());

            UpdateUserResponse response = interactRest.updateUser(request);
            JOptionPane.showMessageDialog(null, response.getAnswer());
        }
    });
}
}
