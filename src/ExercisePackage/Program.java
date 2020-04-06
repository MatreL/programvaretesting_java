package ExercisePackage;
import java.util.ArrayList;

public class Program {
    public ArrayList<Exercise> exercises = new ArrayList<>();
    public String programName;
    public Program(String programName){
        this.programName = programName;
    }

    public void addExercise(ArrayList<Exercise> exercises) {this.exercises=exercises;}

    @Override
    public String toString(){
        String programDetails;
        int duration = 0;
        int intensityLevel = 0;
        programDetails = "The name of this program is:\n" + programName + "\nAnd his is the exercises: ";
        for (int i = 0; i<exercises.size();i++){
           duration = exercises.get(i).duration + duration;
           programDetails += "\n" + exercises.get(i) +"\n\n";

           if(exercises.get(i).intensity>intensityLevel){
               intensityLevel = exercises.get(i).intensity;
           }

        }

        duration = duration * 2;
        programDetails += "Duration is: " + duration + "\n";
        programDetails += "Intensity level " + intensityLevel;

        boolean balanceBoolean = false;
        boolean enduranceBoolean = false;
        boolean flexiblilityBoolean = false;
        boolean strengthBoolean = false;

        for (Exercise exercise : exercises) {
            if (exercise instanceof Balance) {
                balanceBoolean = true;
            }
            if (exercise instanceof Endurance) {
                enduranceBoolean = true;
            }
            if (exercise instanceof Flexibility) {
                flexiblilityBoolean = true;
            }
            if (exercise instanceof Strength) {
                strengthBoolean = true;
            }
        }

        // If all the booleans are true this is a balanced system, else they're not
        if (balanceBoolean && enduranceBoolean && flexiblilityBoolean && strengthBoolean) {
                 programDetails += "\nThis program is balanced.";
            } else {
                 programDetails += "\nThis program is NOT balanced";
            }

        return programDetails;
    }

}
