package lt.viko.eif.vskuder.GUI.Game;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.RemoveGameRequest;
import lt.viko.eif.vskuder.client.RemoveGameResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeleteGameForm {
    private JPanel DeleteGamePanel;
    private JTextField textField1;
    private JButton deleteGameButton;
    private JFrame frame;
public DeleteGameForm() {
    frame = new JFrame("DeleteGameForm");
    frame.setContentPane(DeleteGamePanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    deleteGameButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            RemoveGameRequest removeGameRequest = new RemoveGameRequest();
            removeGameRequest.setGameId(Integer.parseInt(textField1.getText()));

            RemoveGameResponse removeGameResponse = interactRest.removeGame(removeGameRequest);
            JOptionPane.showMessageDialog(null, removeGameResponse.getAnswer());
        }
    });
}
}
