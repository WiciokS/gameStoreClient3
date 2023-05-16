package lt.viko.eif.vskuder.GUI.Game;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Class for GameForm.
 */
public class GameForm {
    private JButton getGameButton;
    private JButton getAllGamesButton;
    private JButton addGameButton;
    private JButton updateGameButton;
    private JButton deleteGameButton;
    private JPanel gamePanel;
    private JFrame frame;
    /**
     * Constructor with parameters.
     */
    public GameForm() {
        frame = new JFrame("GameForm");
        frame.setContentPane(gamePanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        getGameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetGameForm();
            }
        });
        getAllGamesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetAllGamesForm();
            }
        });
        addGameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new AddGameForm();
            }
        });
        updateGameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new UpdateGameForm();
            }
        });
        deleteGameButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new DeleteGameForm();
            }
        });
    }
}
