package lt.viko.eif.vskuder.GUI;

import lt.viko.eif.vskuder.GUI.Category.CategoryForm;
import lt.viko.eif.vskuder.GUI.Developer.DeveloperForm;
import lt.viko.eif.vskuder.GUI.Game.GameForm;
import lt.viko.eif.vskuder.GUI.Library.LibraryForm;
import lt.viko.eif.vskuder.GUI.User.UserForm;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainForm{
    private JButton userButton;
    private JButton gameButton;
    private JButton developerButton;
    private JButton categoryButton;
    private JButton libraryButton;
    private JPanel mainPanel;
    private JFrame frame;

    public MainForm() {
    frame = new JFrame("MainForm");
    frame.setContentPane(mainPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);
    frame.setVisible(true);


    userButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            new UserForm();
        }
    });
    gameButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            new GameForm();
        }
    });

    developerButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            new DeveloperForm();
        }
    });
    categoryButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            new CategoryForm();
        }
    });
    libraryButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            new LibraryForm();
        }
    });
}
}
