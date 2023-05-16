package lt.viko.eif.vskuder.GUI.Library;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.GetLibraryRequest;
import lt.viko.eif.vskuder.client.GetLibraryResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GetUserLibraryGamesForm {
    private JPanel GetUserLibraryGamesPanel;
    private JTextField textField1;
    private JButton getAllUserGamesButton;
    private JFrame frame;
public GetUserLibraryGamesForm() {
    frame = new JFrame("GetUserLibraryGamesForm");
    frame.setContentPane(GetUserLibraryGamesPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    getAllUserGamesButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            GetLibraryRequest request = new GetLibraryRequest();
            request.setUserId(Integer.parseInt(textField1.getText()));

            GetLibraryResponse response = interactRest.getLibrary(request);
            //output all games as one string in user library using loop
            String output = "";
            for (int i = 0; i < response.getGames().size(); i++) {
                output += response.getGames().get(i).getId() + " ";
                output += response.getGames().get(i).getTitle() + "\n";
            }
            JOptionPane.showMessageDialog(null, output);
        }
    });
}
}
