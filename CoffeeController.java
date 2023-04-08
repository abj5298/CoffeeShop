import java.awt.event.*;
public class CoffeeController {
    private CoffeeModel model;
    private CoffeeView view;

    CoffeeController(CoffeeModel model, CoffeeView view){
        this.model = model;
        this.view = view;

        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if ("Get Coffee".equals(ev.getActionCommand()))
                {
                    view.setCurrentCoffee(model.getCoffee());
                }
                else
                {
                    view.setCurrentCoffee(model.getName());
                }
            }
        }
        view.addCoffeeButtonListener(new ButtonListener());
        view.addNameButtonListener(new ButtonListener());
    }
}
