package lt.viko.eif.vskuder.GUI.Developer;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeveloperForm {
    private JButton getDeveloperButton;
    private JButton getAllDevelopersButton;
    private JButton addDeveloperButton;
    private JButton updateDeveloperButton;
    private JButton deleteDeveloperButton;
    private JPanel developerPanel;
    private JFrame frame;

    public DeveloperForm() {
        frame = new JFrame("DeveloperForm");
        frame.setContentPane(developerPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        getDeveloperButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetDeveloperForm();
            }
        });
        getAllDevelopersButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetAllDevelopersForm();
            }
        });
        addDeveloperButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new AddDeveloperForm();
            }
        });
        updateDeveloperButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new UpdateDeveloperForm();
            }
        });
        deleteDeveloperButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new DeleteDeveloperForm();
            }
        });
    }
}
