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
        Person p1 = new Person("Even", "Strength", 2);
        Person p2 = new Person("Peder", "Flexibility", 9);
        Person p3 = new Person("Olav", "Balance", 7);
        Person p4 = new Person("Alexander", "Strength", 4);
        Person p5 = new Person("Erik", "Flexibility", 10);
    }


}
