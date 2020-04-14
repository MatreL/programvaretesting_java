package ExercisePackage;
import java.util.ArrayList;
import java.util.Comparator;

public class Program {
    private ArrayList<Exercise> exercises = new ArrayList<>();
    private String programName;
    private int intensity = 0;
    private int duration = 0;
    public boolean isBalanced;

    public Program(String programName) {
        this.programName = programName;
    }

    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
        for (int i = 0; i < this.exercises.size(); i++) {
            if (this.intensity < this.exercises.get(i).intensity) {
                this.intensity = this.exercises.get(i).intensity;
            }
        }

        if(!this.isBalanced) {
            isBalanced();
        }
    }

    public boolean isBalanced() {
        if (hasExercise("Endurance")
                && hasExercise("Balance")
                && hasExercise("Flexibility")
                && hasExercise("Strength")) {
            this.isBalanced = true;
        }
        return isBalanced;
    }

    public int totalDuration() {
        for (int i = 0; i < exercises.size(); i++) {
            this.duration += this.exercises.get(i).duration;
        }
        this.duration = duration * 2;

        return duration;
    }


    public boolean hasExercise (String param) {
        for (Exercise e:exercises) {
            if (e.getType().equals(param)) {
                return true;
            }
        }
        return false;
    }

    public void sortExercise(){
        exercises.sort(Comparator.comparingInt(Exercise::getIntensity));
    }

    public String printIsBalanced() {

        if (isBalanced) {
            return "The program is balanced";
        } else {
            return "The program is not balanced";
        }
    }

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



