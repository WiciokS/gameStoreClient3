package lt.viko.eif.vskuder.GUI.Developer;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.GetDeveloperRequest;
import lt.viko.eif.vskuder.client.GetDeveloperResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Class for GetDeveloperForm.
 */
public class GetDeveloperForm {
    private JPanel GetDeveloperPanel;
    private JTextField textField1;
    private JButton getDeveloperButton;
    private JFrame frame;

    /**
     * Constructor with parameters.
     */
    public GetDeveloperForm() {
    frame = new JFrame("GetDeveloperForm");
    frame.setContentPane(GetDeveloperPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    getDeveloperButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            GetDeveloperRequest getDeveloperRequest = new GetDeveloperRequest();
            getDeveloperRequest.setDeveloperId(Integer.parseInt(textField1.getText()));

            GetDeveloperResponse getDeveloperResponse = interactRest.getDeveloper(getDeveloperRequest);
            JOptionPane.showMessageDialog(null, getDeveloperResponse.getDeveloper().getName());
        }
    });
}
}
