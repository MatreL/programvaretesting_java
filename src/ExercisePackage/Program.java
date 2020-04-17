package ExercisePackage;
import java.util.ArrayList;
import java.util.Comparator;

public class Program {
    private ArrayList<Exercise> exercises = new ArrayList<>();
    private String programName;
    private int intensity = 0;
    private int duration = 0;
    public boolean isBalanced;
//Constructor for Program class
    public Program(String programName) {
        this.programName = programName;
    }
//Method to add an exercise to the program
    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
        for (Exercise value : this.exercises) {
            if (this.intensity < value.intensity) {
                this.intensity = value.intensity;
            }
        }

        if(!this.isBalanced) {
            isBalanced();
        }
    }
//Method that checks if the program contain one of each exercise
    public boolean isBalanced() {
        if (hasExercise("Endurance")
                && hasExercise("Balance")
                && hasExercise("Flexibility")
                && hasExercise("Strength")) {
            this.isBalanced = true;
        }
        return isBalanced;
    }
//Method that sums up the total duration, and multiplies it with 2
    public int totalDuration() {
        for (Exercise exercise : exercises) {
            this.duration += exercise.duration;
        }
        this.duration = duration * 2;

        return duration;
    }

//Method that is part of the isBalanced method. Iterates through the exercises, and returns true if
//it is a match.
    public boolean hasExercise (String param) {
        for (Exercise e:exercises) {
            if (e.getType().equals(param)) {
                return true;
            }
        }
        return false;
    }
// Method to sort the exercises in ascending order
    public void sortExercise(){
        exercises.sort(Comparator.comparingInt(Exercise::getIntensity));
    }

//Part of the print method, print wherever the program is balanced or not
    public String printIsBalanced() {

        if (isBalanced) {
            return "The program is balanced";
        } else {
            return "The program is not balanced";
        }
    }
//Print method for programs
    public void print() {
        sortExercise();
        System.out.print("The name of the program is \n");
        System.out.print(programName + "\n");
        System.out.print("And this is the exercises: \n" );

        for (Exercise exercise : exercises) {
            System.out.print(exercise.print() + "\n\n");
        }

        System.out.print("This is the total duration: " + totalDuration() + "\n");
        System.out.println(printIsBalanced());
        System.out.println("The highest intensity is: " + this.intensity + "\n\n");
    }

    public int getHighestIntensity(){
        return intensity;
    }
    public ArrayList<Exercise> getExercises(){
      return this.exercises;
    }

    public String getProgramName(){
        return programName;
    }
}



