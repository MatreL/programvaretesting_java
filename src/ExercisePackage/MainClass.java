package ExercisePackage;

public class MainClass {
    public static void main(String[] args) {
        Exercise ex01 = new Exercise("Man1", 3,30,5,3);
        System.out.println(ex01.toString());

        System.out.println("----------------");
        System.out.println("Strength");

        Exercise Olav = new Strength("Man 2",10,30,8,4,100,"Bench");
        System.out.println(Olav.toString());

        System.out.println("----------------");
        System.out.println("Flexibility");

        Exercise Peder = new Flexibility("Man 3",20,60,10,3,"Yoga pants");
        System.out.println(Peder.toString());

        System.out.println("----------------");
        System.out.println("Endurance");

        Exercise Even = new Endurance("Man 4", 5, 30, 2, 3, "Shoes");
        System.out.println(Even.toString());

        System.out.println("----------------");
        System.out.println("Balance");

        Exercise Alex = new Balance("Man 5",2, 10, 15, 4, "fitness ball");
        System.out.println(Alex.toString());

    }
}
