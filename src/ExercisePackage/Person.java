package ExercisePackage;

import java.util.ArrayList;

public class Person {

    public ArrayList<Exercise> exercises = new ArrayList<>();
    public String preferredExercise;
    public int acceptableIntensity;
    public Object acceptableProgram;

    public Person(String preferredExercise, int acceptableIntensity, Object acceptableProgram) {
        this.acceptableIntensity = acceptableIntensity;
        this.preferredExercise = preferredExercise;
        this.acceptableProgram = acceptableProgram;

        getPreferredExercise();
    }

    public void getPreferredExercise() {

        String[] acceptedPrefExercise = new String[4];
        acceptedPrefExercise[0] = "balance";
        acceptedPrefExercise[1] = "endurance";
        acceptedPrefExercise[2] = "flexibility";
        acceptedPrefExercise[3] = "strength";

        String str = preferredExercise.toLowerCase();
        int i = 0;
        boolean acceptedPreferredProgram = false;

        while (!acceptedPreferredProgram || i < 4 ) {
            if (str.equals(acceptedPrefExercise[i])) {
                acceptedPreferredProgram = true;
            }
            i++;
        }

        if (preferredExercise.equals("")){
            throw new IllegalArgumentException("Preferred exercise has to be either balance, endurance," +
                    " flexibility or strength!");
        }
    }

    public void getAcceptableIntensity(ArrayList<Exercise> exercises) {

        boolean containsProgramWithIntensity = false;

        for (Exercise exercise : exercises) {
            if (acceptableIntensity == exercise.getIntensity() || acceptableIntensity + 1 == exercise.getIntensity()
                    || acceptableIntensity - 1 == exercise.getIntensity()) {
                System.out.println(exercise.print());
                System.out.println("______________________________");
                containsProgramWithIntensity = true;
            }
        }
        if (!containsProgramWithIntensity) {
            System.out.println("There are no programs this intensity..");
        }

    }




    public static void main(String[] args) {

        Person p1 = new Person("Strength",4,10);

        Exercise Olav = new Strength("Mannen","Bench",1,30,8,4,100);
        Exercise Peder = new Flexibility("Mannto","Yoga pants",9,60,10,3);
        Exercise Even = new Endurance( "Man tRe", "Shoes",5, 30, 10, 2 );
        Exercise Alex = new Balance( "Man-fire","Fitness ball", 2, 1, 15, 4);

        ArrayList<Exercise> exercises = new ArrayList<>();

        exercises.add(Alex);
        exercises.add(Even);
        exercises.add(Peder);
        exercises.add(Olav);

        p1.getAcceptableIntensity(exercises);
    }

}
