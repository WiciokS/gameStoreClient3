package lt.viko.eif.vskuder.GUI.Developer;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.Developer;
import lt.viko.eif.vskuder.client.GetDevelopersRequest;
import lt.viko.eif.vskuder.client.GetDevelopersResponse;

import javax.swing.*;
import java.util.List;
/**
 * Class for GetAllDevelopersForm.
 */
public class GetAllDevelopersForm {
    private JList list1;
    private JPanel GetAllDevelopersPanel;
    private JFrame frame;
    /**
     * Constructor with parameters.
     */
    public GetAllDevelopersForm() {
        frame = new JFrame("GetAllDevelopersForm");
        frame.setContentPane(GetAllDevelopersPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        InteractRest interactRest = new InteractRest();
        GetDevelopersRequest getDevelopersRequest = new GetDevelopersRequest();
        GetDevelopersResponse getDevelopersResponse = interactRest.getDevelopers(getDevelopersRequest);
        //using loop add all developers to list
        List<Developer> developers = getDevelopersResponse.getDevelopers();
        DefaultListModel<String> model = new DefaultListModel<>();
        for (Developer developer : developers) {
            model.addElement(developer.getId() + " " + developer.getName());
        }
        list1.setModel(model);
    }
}
