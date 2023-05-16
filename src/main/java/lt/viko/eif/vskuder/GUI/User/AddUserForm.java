package lt.viko.eif.vskuder.GUI.User;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.CreateUserRequest;
import lt.viko.eif.vskuder.client.CreateUserResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddUserForm {
    private JPanel AddUserPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton createNewUserButton;
    private JFrame frame;
public AddUserForm() {
    frame = new JFrame("AddUserForm");
    frame.setContentPane(AddUserPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    createNewUserButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();
            CreateUserRequest request = new CreateUserRequest();
            request.setUsername(textField1.getText());
            request.setPassword(textField2.getText());

            CreateUserResponse response = interactRest.createUser(request);
            JOptionPane.showMessageDialog(null, response.getAnswer());
        }
    });
}
}
