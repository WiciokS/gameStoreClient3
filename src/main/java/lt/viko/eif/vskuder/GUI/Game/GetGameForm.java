package lt.viko.eif.vskuder.GUI.Game;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.GetGameRequest;
import lt.viko.eif.vskuder.client.GetGameResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GetGameForm {
    private JPanel GetGamePanel;
    private JTextField textField1;
    private JButton getGameDataButton;
    private JFrame frame;

public GetGameForm() {
    frame = new JFrame("GetGameForm");
    frame.setContentPane(GetGamePanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    getGameDataButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            GetGameRequest getGameRequest = new GetGameRequest();
            getGameRequest.setGameId(Integer.parseInt(textField1.getText()));

            GetGameResponse getGameResponse = interactRest.getGame(getGameRequest);
            JOptionPane.showMessageDialog(null, getGameResponse.getGame().getTitle() + "\n" +
                    getGameResponse.getGame().getPrice() + "\n" +
                    getGameResponse.getGame().getDeveloper().getName() + "\n" +
                    getGameResponse.getGame().getCategory().getName());
        }
    });
}
}
