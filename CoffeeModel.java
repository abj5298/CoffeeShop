public class CoffeeModel {
    final private String[] COFFEE = {"Cappuccino", "Latte", "Americano", "Espresso", "Mocha"};
    final private String[] NAME = {"Angela Jobi", "Jesse Turner", "Ellen Wild"};
    CoffeeModel(){ }

    public String getCoffee(){
        int coffeeIndex = (int) (java.lang.Math.random() * COFFEE.length);
        return COFFEE[coffeeIndex];
    }
    public String getName(){
        int coffeeIndex = (int) (java.lang.Math.random() * NAME.length);
        return NAME[coffeeIndex];
    }

}
