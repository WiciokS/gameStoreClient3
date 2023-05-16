package lt.viko.eif.vskuder.GUI.Game;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.Game;
import lt.viko.eif.vskuder.client.GetGamesRequest;
import lt.viko.eif.vskuder.client.GetGamesResponse;

import javax.swing.*;
import java.util.List;
/**
 * Class for GetAllGamesForm.
 */
public class GetAllGamesForm {
    private JPanel GetAllGamesPanel;
    private JList list1;
    private JFrame frame;
    /**
     * Constructor with parameters.
     */
    public GetAllGamesForm() {
        frame = new JFrame("GetAllGamesForm");
        frame.setContentPane(GetAllGamesPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        InteractRest interactRest = new InteractRest();
        GetGamesRequest getGamesRequest = new GetGamesRequest();
        GetGamesResponse getGamesResponse = interactRest.getGames(getGamesRequest);
        //using loop add all games to list
        List<Game> games = getGamesResponse.getGames();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Game game : games) {
            model.addElement(
                    game.getId() + " " +
                            game.getTitle() + " " +
                            game.getPrice() + " " +
                            game.getDeveloper().getName() + " " +
                            game.getCategory().getName());
        }
        list1.setModel(model);

    }
}
