package lt.viko.eif.vskuder.GUI.Category;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.CreateCategoryRequest;
import lt.viko.eif.vskuder.client.CreateCategoryResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Class for AddCategoryForm.
 */
public class AddCategoryForm {
    private JPanel addCategoryPanel;
    private JTextField textField1;
    private JButton createNewCategoryButton;
    private JFrame frame;
public AddCategoryForm() {
    frame = new JFrame("AddCategory");
    frame.setContentPane(addCategoryPanel);
    frame.pack();
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setSize(500, 500);

    createNewCategoryButton.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            InteractRest interactRest = new InteractRest();

            CreateCategoryRequest createCategoryRequest = new CreateCategoryRequest();
            createCategoryRequest.setCategoryName(textField1.getText());

            CreateCategoryResponse createCategoryResponse = interactRest.createCategory(createCategoryRequest);
            JOptionPane.showMessageDialog(null, createCategoryResponse.getAnswer());
        }
    });
}
}
