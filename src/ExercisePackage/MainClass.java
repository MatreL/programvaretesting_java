package ExercisePackage;

public class MainClass {
    public static void main(String[] args) {
        Exercise ex01 = new Exercise(3,30,5,3);
        System.out.println(ex01.toString());

        System.out.println("----------------");
        System.out.println("    Strength");

        Strength Olav = new Strength(10,30,8,4,100,"Bench");
        System.out.println(Olav.toString());

        System.out.println("----------------");
        System.out.println("Flexibility");

        Flexibility Peder = new Flexibility(20,60,10,3,"Yoga pants");
        System.out.println(Peder.toString());

        System.out.println("----------------");

        Endurance Even = new Endurance(5, 30, 2, 1, "Shoes");
        System.out.println(Even.toString());

        System.out.println("----------------");

        Balance Alex = new Balance(2, 10, 15, 4, "fitness ball");
        System.out.println(Alex.toString());

    }
}
