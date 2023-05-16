package lt.viko.eif.vskuder.GUI.Category;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.UpdateCategoryRequest;
import lt.viko.eif.vskuder.client.UpdateCategoryResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateCategoryForm {
    private JPanel updateCategoryPanel;
    private JTextField textField2;
    private JTextField textField1;
    private JButton updateButton;
    private JFrame frame;

    public UpdateCategoryForm() {
        frame = new JFrame("UpdateCategoryForm");
        frame.setContentPane(updateCategoryPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        updateButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                InteractRest interactRest = new InteractRest();

                UpdateCategoryRequest updateCategoryRequest = new UpdateCategoryRequest();
                updateCategoryRequest.setCategoryId(Integer.parseInt(textField1.getText()));
                updateCategoryRequest.setCategoryName(textField2.getText());

                UpdateCategoryResponse updateCategoryResponse = interactRest.updateCategory(updateCategoryRequest);
                JOptionPane.showMessageDialog(null, updateCategoryResponse.getAnswer());
            }
        });
    }
}
