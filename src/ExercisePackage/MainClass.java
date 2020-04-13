package ExercisePackage;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Exercise strength1 = new Strength("Bench press","Bench",10,30,8,4,100);
        Exercise strength2 = new Strength("Pullups", "Pull-up-bar", 9, 15, 10, 5, 15);
        Exercise strength3 = new Strength("Biceps curl", "Manuals", 7, 10, 10,3, 22.5);

        Exercise flex1 = new Flexibility("Shoulder stretch", "Stretch-Out-Strap", 7, 5, 4, 4);
        Exercise flex2 = new Flexibility("Stretching", "Adjustable-Slant-Board", 3, 10, 8, 3);
        Exercise flex3 = new Flexibility("Yoga","Yoga pants",9,60,10,3);

        Exercise endurance1 = new Endurance("Cycling", "Bicycle", 10, 60, 3, 3);
        Exercise endurance2 = new Endurance("Swimming", "Swimmingpool", 8, 20, 15, 2);
        Exercise endurance3 = new Endurance( "Maraton", "Shoes",5, 30, 10, 2 );

        Exercise balance1 = new Balance("Handstand", "Mat", 8, 10, 10, 3);
        Exercise balance2 = new Balance("Headstand","Thick mat", 5, 15, 7, 2);
        Exercise balance3 = new Balance( "LineWalk","Slackline", 6, 1, 15, 4);
/*
        public void suggestProgramsForAllPersons(){
         //Print suggested program for all persons
        return true;
        }

 */

/*

        public boolean SetAcceptableProgram(ArrayList<Program> ex) {

            boolean containsProgramWithIntensity = false;

            for (int x = 0; x < ex.size(); x++) {

                if (acceptableIntensity == ex.get(x).getIntensity() || acceptableIntensity + 1 == ex.get(x).getIntensity()
                        || acceptableIntensity - 1 == ex.get(x).getIntensity()) {

                    if (preferredExercise.equals(ex.get(x).getType())) {

                        System.out.println("------------------------");
                    }

                    containsProgramWithIntensity = true;
                }
            }

            if (!containsProgramWithIntensity) {
                throw new IllegalArgumentException("There are no programs with this intensity..");
            }
        }

 */

        ArrayList<Exercise> exercises = new ArrayList<>();
        ArrayList<Program> programs = new ArrayList<>();

        Program p1 = new Program("Program nr 1");
        programs.add(p1);
        exercises.add(strength1);
        exercises.add(flex1);
        exercises.add(endurance1);
        exercises.add(balance1);
        p1.addExercise(exercises);
        p1.print();

        Person Erik = new Person("Endurance", 10);

        System.out.println(Erik.singleProgramIsAppropiateForPerson(p1));





    }
}
