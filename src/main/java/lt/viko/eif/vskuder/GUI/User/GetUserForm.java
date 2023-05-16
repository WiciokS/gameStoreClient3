package lt.viko.eif.vskuder.GUI.User;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.GetUserRequest;
import lt.viko.eif.vskuder.client.GetUserResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GetUserForm {
    private JPanel GetUserPanel;
    private JTextField textField1;
    private JButton getUserDataButton;
    private JFrame frame;
public GetUserForm() {
    frame = new JFrame("GetUserForm");
    frame.setContentPane(GetUserPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    getUserDataButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            GetUserRequest request = new GetUserRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));

            GetUserResponse response = interactRest.getUser(request);
            JOptionPane.showMessageDialog(null, response.getUser().getId() + " " +
            response.getUser().getUsername() + " " + response.getUser().getPassword());
        }
    });
}
}
