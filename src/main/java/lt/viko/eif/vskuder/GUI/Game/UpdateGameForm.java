package lt.viko.eif.vskuder.GUI.Game;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.UpdateGameRequest;
import lt.viko.eif.vskuder.client.UpdateGameResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateGameForm {
    private JPanel UpdateGamePanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton updateGameDataButton;
    private JFrame frame;
public UpdateGameForm() {
    frame = new JFrame("UpdateGameForm");
    frame.setContentPane(UpdateGamePanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    updateGameDataButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            UpdateGameRequest updateGameRequest = new UpdateGameRequest();
            updateGameRequest.setGameId(Integer.parseInt(textField1.getText()));
            updateGameRequest.setGameTitle(textField2.getText());
            updateGameRequest.setGamePrice(Double.parseDouble(textField3.getText()));
            updateGameRequest.setGameDeveloperId(Integer.parseInt(textField4.getText()));
            updateGameRequest.setGameCategoryId(Integer.parseInt(textField5.getText()));

            UpdateGameResponse updateGameResponse = interactRest.updateGame(updateGameRequest);
            JOptionPane.showMessageDialog(null, updateGameResponse.getAnswer());
        }
    });
}
}
