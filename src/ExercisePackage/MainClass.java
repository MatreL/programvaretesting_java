package ExercisePackage;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Exercise strength1 = new Strength("Bench press","Bench",10,30,8,4,100);
        Exercise strength2 = new Strength("Pull ups", "Pull-up-bar", 9, 15, 10, 5, 15);
        Exercise strength3 = new Strength("Biceps curl", "Manuals", 7, 10, 10,3, 22.5);

        Exercise flex1 = new Flexibility("Shoulder stretch", "Stretch-Out-Strap", 7, 5, 4, 4);
        Exercise flex2 = new Flexibility("Stretching", "Adjustable-Slant-Board", 3, 10, 8, 3);
        Exercise flex3 = new Flexibility("Yoga","Yoga pants",9,60,10,3);

        Exercise endurance1 = new Endurance("Cycling", "Bicycle", 10, 60, 3, 3);
        Exercise endurance2 = new Endurance("Swimming", "Swimming pool", 8, 20, 15, 2);
        Exercise endurance3 = new Endurance( "Marathon", "Shoes",5, 30, 10, 2 );

        Exercise balance1 = new Balance("Handstand", "Mat", 8, 10, 10, 3);
        Exercise balance2 = new Balance("Headstand","Thick mat", 5, 15, 7, 2);
        Exercise balance3 = new Balance( "LineWalk","Slack line", 6, 1, 15, 4);

        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Exercise> exercises = new ArrayList<>();
        ArrayList<Program> programs = new ArrayList<>();


        Program p1 = new Program("Program nr 1");
        programs.add(p1);
        p1.addExercise(strength1);
        p1.addExercise(flex1);
        p1.addExercise(endurance1);
        p1.addExercise(balance1);
        p1.addExercise(balance2);
        p1.print();

        Program p2 = new Program("Program nr 2");
        programs.add(p2);

        p2.addExercise(flex3);
        p2.addExercise(flex1);
        p2.addExercise(flex2);
        p2.print();


        Person Erik = new Person("Flexibility", 10);
        Person Bogdan = new Person("Strength", 1);
        persons.add(Erik);
        persons.add(Bogdan);

        Erik.reccomendProgramForSinglePerson(programs);

    }
}

