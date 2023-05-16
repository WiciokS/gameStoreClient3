package lt.viko.eif.vskuder.GUI.Category;

import lt.viko.eif.vskuder.REST.InteractRest;
import lt.viko.eif.vskuder.client.GetCategoryRequest;
import lt.viko.eif.vskuder.client.GetCategoryResponse;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * Class for GetCategoryForm.
 */
public class GetCategoryForm {
    private JPanel getCategoryPanel;
    private JTextField textField1;
    private JButton getCategoryButton;
    private JFrame frame;
    /**
     * Constructor with parameters.
     */
    public GetCategoryForm() {
        frame = new JFrame("GetCategoryForm");
        frame.setContentPane(getCategoryPanel);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        getCategoryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                InteractRest interactRest = new InteractRest();

                GetCategoryRequest getCategoryRequest = new GetCategoryRequest();
                getCategoryRequest.setCategoryId(Integer.parseInt(textField1.getText()));

                GetCategoryResponse getCategoryResponse = interactRest.getCategory(getCategoryRequest);
                JOptionPane.showMessageDialog(null, getCategoryResponse.getCategory().getName());
            }
        });
    }
}
