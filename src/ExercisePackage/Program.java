package ExercisePackage;
import java.util.ArrayList;
import java.util.Collections;

public class Program {
    private ArrayList<Exercise> exercises = new ArrayList<>();
    public ArrayList<Program> programs = new ArrayList<>();
    private String programName;
    private int intensity = 0;
    private int duration = 0;
    private boolean isBalanced;

    public Program(String programName) {
        this.programName = programName;
    }

    public void addExercise(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
        for (int i = 0; i < exercises.size(); i++) {
            this.duration += exercises.get(i).duration * 2;
            if (this.intensity < exercises.get(i).intensity) {
                this.intensity = exercises.get(i).intensity;
            }
        }
        if (hasExercise("Endurance")
                && hasExercise("Balance")
                && hasExercise("Flexibility")
                && hasExercise("Strength")) {
            this.isBalanced = true;
        }
    }
    public void addProgram (ArrayList<Program> programs){
        this.programs = programs;
        String programName = this.programName;
        int highestIntensity = this.intensity;
        for (int i = 0; i<programs.size(); i++){
            System.out.println(programs.get(i));
        }





    }


    public boolean hasExercise (String param) {
        for (Exercise e:exercises) {
            if (e.getType() == param) {
                return true;
            }
        }
        return false;
    }

    public void sortExercise(){
        Collections.sort(exercises, (o1, o2) -> (o1.getIntensity()) - (o2.getIntensity()));
    }


    public void print() {
        sortExercise();
        System.out.print("The name of the program is \n");
        System.out.print(programName + "\n");
        System.out.print("And this is the exercises: \n" );
        for (int i = 0; i<exercises.size();i++){
            System.out.print(exercises.get(i).print() + "\n\n");

        }
        System.out.print("This is the total duration: " + this.duration + "\n");
        if(isBalanced == true){
            System.out.print("The program is balanced\n");
        }
        else {
            System.out.print("The program is not balanced\n");
        }
        System.out.println("The highest intensity is: " + this.intensity);

    }
    public int getHighestIntensity(){
        return intensity;
    }

    public int getIntensity() {
        return intensity;
    }

    public boolean isBalanced() {
        return isBalanced;
    }

    public int getDuration() {
        return duration;
    }

}



