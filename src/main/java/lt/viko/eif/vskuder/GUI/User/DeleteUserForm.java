package lt.viko.eif.vskuder.GUI.User;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.RemoveUserRequest;
import lt.viko.eif.vskuder.client.RemoveUserResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeleteUserForm {
    private JPanel DeleteUserPanel;
    private JTextField textField1;
    private JButton deleteUserButton;
    private JFrame frame;
public DeleteUserForm() {
    frame = new JFrame("DeleteUserForm");
    frame.setContentPane(DeleteUserPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    deleteUserButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            RemoveUserRequest request = new RemoveUserRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));

            RemoveUserResponse response = interactRest.removeUser(request);
            JOptionPane.showMessageDialog(null, response.getAnswer());
        }
    });
}
}
