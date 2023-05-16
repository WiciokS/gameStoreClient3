package lt.viko.eif.vskuder.GUI.Library;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.GetLibraryUserRequest;
import lt.viko.eif.vskuder.client.GetLibraryUserResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Class for GetAllUserDataForm.
 */
public class GetAllUserDataForm {
    private JPanel GetAllUserDataPanel;
    private JTextField textField1;
    private JButton getAllDataButton;
    private JFrame frame;
    /**
     * Constructor with parameters.
     */
public GetAllUserDataForm() {
    frame = new JFrame("GetAllUserDataForm");
    frame.setContentPane(GetAllUserDataPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    getAllDataButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            GetLibraryUserRequest request = new GetLibraryUserRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));

            GetLibraryUserResponse response = interactRest.getLibraryUser(request);
            //output all user data as one string in user library using loop
            String output = "";
            output += "UserId: " + response.getUser().getId() + "\n";
            output += "UserName: " + response.getUser().getUsername() + "\n";
            output += "UserPassword: " + response.getUser().getPassword() + "\n";

            for(int i = 0; i < response.getGames().size(); i++) {
                output += "GameId: " + response.getGames().get(i).getId() + "\n";
                output += "GameTitle: " + response.getGames().get(i).getTitle() + "\n";
                output += "GamePrice: " + response.getGames().get(i).getPrice() + "\n";
                output += "GameDeveloperId: " + response.getGames().get(i).getDeveloper().getId() + "\n";
                output += "GameDeveloperName: " + response.getGames().get(i).getDeveloper().getName() + "\n";
                output += "GameCategoryId: " + response.getGames().get(i).getCategory().getId() + "\n";
                output += "GameCategoryName: " + response.getGames().get(i).getCategory().getName() + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
        }
    });
}
}
