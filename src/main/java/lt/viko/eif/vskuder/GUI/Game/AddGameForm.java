package lt.viko.eif.vskuder.GUI.Game;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.CreateGameRequest;
import lt.viko.eif.vskuder.client.CreateGameResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddGameForm {
    private JPanel AddGamePanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JFrame frame;
public AddGameForm() {
    frame = new JFrame("AddGameForm");
    frame.setContentPane(AddGamePanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);
    button1.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            CreateGameRequest createGameRequest = new CreateGameRequest();
            createGameRequest.setGameTitle(textField1.getText());
            createGameRequest.setGamePrice(Double.parseDouble(textField2.getText()));
            createGameRequest.setGameDeveloperId(Integer.parseInt(textField3.getText()));
            createGameRequest.setGameCategoryId(Integer.parseInt(textField4.getText()));

            CreateGameResponse createGameResponse = interactRest.createGame(createGameRequest);
            JOptionPane.showMessageDialog(null, createGameResponse.getAnswer());
        }
    });
}
}
