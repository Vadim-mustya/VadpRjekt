public class Plate {

    private static int food;

    Plate(int food)
    {
        this.food = food;
    }

    public void info()
    {
        System.out.println("plate: " + food);
    }

    int getFood()
    {
        return food;
    }


    void setFood(int food)
    {
        this.food += food;
    }


    void decreaseFood(int appetite)
    {
        this.food -= appetite;
    }

}
