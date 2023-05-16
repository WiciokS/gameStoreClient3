package lt.viko.eif.vskuder.GUI.Library;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LibraryForm {
    private JButton addItemToLibraryButton;
    private JButton removeItemFromLibraryButton;
    private JPanel libraryPanel;
    private JButton getAllUserGamesButton;
    private JButton getAllUserDataButton;
    private JFrame frame;

    public LibraryForm() {
        frame = new JFrame("LibraryForm");
        frame.setContentPane(libraryPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        addItemToLibraryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new AddItemToLibraryForm();
            }
        });
        removeItemFromLibraryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new RemoveItemFromLibraryForm();
            }
        });
        getAllUserGamesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetUserLibraryGamesForm();
            }
        });
        getAllUserDataButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetAllUserDataForm();
            }
        });
    }
}
