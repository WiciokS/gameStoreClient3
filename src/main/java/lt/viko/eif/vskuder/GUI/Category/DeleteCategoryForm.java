package lt.viko.eif.vskuder.GUI.Category;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.RemoveCategoryRequest;
import lt.viko.eif.vskuder.client.RemoveCategoryResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeleteCategoryForm {
    private JPanel deleteCategoryPanel;
    private JTextField textField1;
    private JButton deleteCategoryButton;
    private JFrame frame;

    public DeleteCategoryForm() {
        frame = new JFrame("DeleteCategoryForm");
        frame.setContentPane(deleteCategoryPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        deleteCategoryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                InteractRest interactRest = new InteractRest();

                RemoveCategoryRequest removeCategoryRequest = new RemoveCategoryRequest();
                removeCategoryRequest.setCategoryId(Integer.parseInt(textField1.getText()));

                RemoveCategoryResponse removeCategoryResponse = interactRest.removeCategory(removeCategoryRequest);
                JOptionPane.showMessageDialog(null, removeCategoryResponse.getAnswer());
            }
        });
    }
}
