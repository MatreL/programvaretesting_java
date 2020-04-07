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

    public static void main(String[] args) {

        Person p1 = new Person("strength",9,10);
    }

}
