package ExercisePackage;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("----------------");
        System.out.println("Strength");

        Exercise Olav = new Strength("Mannen","Bench",10,30,8,4,100);
        System.out.println(Olav.toString());

        System.out.println("----------------");
        System.out.println("Flexibility");

        Exercise Peder = new Flexibility("Mannto","Yoga pants",9,60,10,3);
        System.out.println(Peder.toString());

        System.out.println("----------------");
        System.out.println("Endurance");

        Exercise Even = new Endurance( "Man tRe", "Shoes",1, 30, 10, 2 );
        System.out.println(Even.print());

        System.out.println("----------------");
        System.out.println("Balance");

        Exercise Alex = new Balance( "Man-fire","Fitness ball", 2, 1, 15, 4);
        System.out.println(Alex.print());


        System.out.println("----------------");
        System.out.println("Programs");

        ArrayList<Exercise> exercises = new ArrayList<>();

        Program p1 = new Program("Program nr 1");
        exercises.add(Alex);
        exercises.add(Even);
        exercises.add(Peder);
        exercises.add(Olav);
        p1.addExercise(exercises);
        p1.print();



    }
}
