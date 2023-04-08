import com.google.gson.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Coffee coffs[] = {new Coffee( 1, "Angela", "Jobi", "Cappuccino", "Cookie"),
                    new Coffee( 2, "Jesse", "Turner", "Latte", "Cheese Cake"),
                    new Coffee( 3, "Ellen", "Wild", "Mocha", "Pastry") };
            try (FileWriter writer = new FileWriter("Coffee.json")) {
                writer.write(new Gson().toJson(coffs));
            }
            Coffee[] coff2 = new Gson().fromJson(new FileReader("Coffee.json"), Coffee[].class);
            for (Coffee coff : coff2){
                System.out.println("Id: " + coff.getId());
                System.out.println("Name: " + coff.getFName() + " " + coff.getLName());
                System.out.println("Drink: " + coff.getDrink());
                System.out.println("Snack: " + coff.getSnack());
            }
        } catch (Exception e) {
        }
        CoffeeModel model = new CoffeeModel();
        CoffeeView view = new CoffeeView(model);
        CoffeeController controller = new CoffeeController(model, view);
        view.setVisible(true);


    }
}


