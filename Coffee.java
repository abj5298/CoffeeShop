public class Coffee {
    private int id;
    private String fName;
    private String lName;
    private String drink;
  private  String snack;

    public Coffee(int id , String fName, String lName, String drink, String snack)
    {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.drink = drink;
        this.snack = snack;

    }
    public int getId()
    {
        return id;
    }

    public String getFName()
    {
        return fName;
    }

    public String getLName()
    {
        return lName;
    }

    public String getDrink()
    {
        return drink;
    }
    public String getSnack()
    {
        return snack;
    }
}
