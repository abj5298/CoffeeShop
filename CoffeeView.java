import java.awt.event.*;
import javax.swing.*;
public class CoffeeView extends JFrame {
    final private JTextField currentCoffeeField;
    final private JButton getCoffeeButton;
    final private JButton getNameButton;
    final private CoffeeModel model;

    CoffeeView(CoffeeModel model){
        this.model = model;
        this.currentCoffeeField = new JTextField( 20);
        this.getCoffeeButton = new JButton( "Get Coffee");
        this.getNameButton = new JButton( "Get Name");

        JPanel content = new JPanel();
        content.add(currentCoffeeField);
        content.add(getCoffeeButton);
        content.add(getNameButton);

        this.setContentPane(content);
        this.pack();
        this.setTitle("Coffee");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addCoffeeButtonListener(ActionListener al){
        getCoffeeButton.addActionListener(al);
    }
    public void setCurrentCoffee(String newCoffee){
        currentCoffeeField.setText(newCoffee);
    }
    public void addNameButtonListener(ActionListener a1){
        getNameButton.addActionListener(a1);
    }
    public void setCurrentCoffee1(String newCoffee){
        currentCoffeeField.setText(newCoffee);
    }
}
