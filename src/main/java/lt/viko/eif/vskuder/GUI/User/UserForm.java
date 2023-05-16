package lt.viko.eif.vskuder.GUI.User;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserForm{
    private JButton getUserButton;
    private JButton getAllUsersButton;
    private JButton addUserButton;
    private JButton updateUserButton;
    private JButton deleteUserButton;
    private JButton convertUserButton;
    private JPanel userPanel;
    private JFrame frame;

    public UserForm() {
        frame = new JFrame("UserForm");
        frame.setContentPane(userPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);

        getUserButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetUserForm();
            }
        });
        getAllUsersButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetAllUsersForm();
            }
        });
        addUserButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new AddUserForm();
            }
        });
        updateUserButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new UpdateUserForm();
            }
        });
        deleteUserButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new DeleteUserForm();
            }
        });
        convertUserButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new ConvertUserForm();
            }
        });
    }
}
