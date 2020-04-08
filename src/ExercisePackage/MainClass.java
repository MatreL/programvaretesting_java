package ExercisePackage;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Exercise Olav = new Strength("Bench press","Bench",10,30,8,4,100);
        Exercise Peder = new Flexibility("Yoga","Yoga pants",9,60,10,3);
        Exercise Even = new Endurance( "Maraton", "Shoes",5, 30, 10, 2 );
        Exercise Alex = new Balance( "LineWalk","Fitness ball", 6, 1, 15, 4);

        Exercise strength1 = new Strength("Hangups", "Pull bar",7,15,8,4, 15);



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
