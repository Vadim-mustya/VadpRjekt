public class Main {

    public static void main(String[] args) {

        String[] names = {"Мурзик","Барсик","Рыжик","Олег","Леха","Вася","Пушистик","Снежок","Игнат","Том"};
        int[] appetite = new int[10];

        for (int i = 0;i < appetite.length;i++)
        {
            appetite[i] =(int) (Math.random() * 36);
        }

        Cat[] cat = new Cat[10];

        Plate plate = new Plate(120);

        for(int i = 0;i < cat.length;i++)
        {
            cat[i] = new Cat(names[i],appetite[i]);
            cat[i].eat(plate);
            cat[i].infoSatiety();
            plate.info();
        }

    }
}
