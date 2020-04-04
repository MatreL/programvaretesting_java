package ExercisePackage;

import java.util.ArrayList;

public class Person {

    public ArrayList<Exercise> exercises = new ArrayList<>();
    private String name;
    private String preferredExercise;
    private int acceptableIntensity;

    public Person(String name, String preferredExercise, int acceptableIntensity){
        this.name = name;
        this.preferredExercise = preferredExercise;
        this.acceptableIntensity = acceptableIntensity;
    }

    public static void main(String[] args) {
        Person p1 = new Person("even", "strengt", 2);
    }


}
