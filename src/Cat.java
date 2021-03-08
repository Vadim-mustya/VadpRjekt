public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    Cat(String name,int appetite )
    {
        this.name = name;
        this.appetite = appetite;
        satiety = false;

    }

    void eat(Plate plate)
    {
        if(appetite <= plate.getFood())
        {
            plate.decreaseFood(appetite);
            satiety = true;
        } else
        {
            satiety = false;
//            System.out.println("Коту " + name + " не хватает еды, что-бы насытиться");
        }
    }

    void infoSatiety()
    {
        if(satiety) System.out.println(name + " сытый");
        if(!satiety) System.out.println(name + " голодный");
    }

}
