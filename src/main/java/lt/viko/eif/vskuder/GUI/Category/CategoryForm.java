package lt.viko.eif.vskuder.GUI.Category;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CategoryForm {
    private JButton getCategoryButton;
    private JButton getAllCategoriesButton;
    private JButton addCategoryButton;
    private JButton updateCategoryButton;
    private JButton deleteCategoryButton;
    private JPanel categoryPanel;
    private JFrame frame;

    public CategoryForm() {
        frame = new JFrame("CategoryForm");
        frame.setContentPane(categoryPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);


        getCategoryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetCategoryForm();
            }
        });
        getAllCategoriesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new GetAllCategoriesForm();
            }
        });
        addCategoryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new AddCategoryForm();
            }
        });
        updateCategoryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new UpdateCategoryForm();
            }
        });
        deleteCategoryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                new DeleteCategoryForm();
            }
        });
    }
}
