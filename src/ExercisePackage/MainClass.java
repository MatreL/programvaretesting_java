package ExercisePackage;

public class MainClass {
    public static void main(String[] args) {
        Exercise ex01 = new Exercise(3,30,5,3);
        System.out.println(ex01.toString());

        System.out.println("----------------");

        Strength Olav = new Strength(10,30,8,4,100,"Bench");
        System.out.println(Olav.toString());

    }
}
