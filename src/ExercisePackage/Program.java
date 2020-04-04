package ExercisePackage;
import java.util.ArrayList;

public class Program {
    public ArrayList<Exercise> exercises = new ArrayList<>();

    public void addExercise(ArrayList<Exercise> exercises) {this.exercises=exercises;}

    @Override
    public String toString(){
        String programDetails;
        int duration = 0;
        int intensityLevel = 0;
        programDetails = "This is the exercises: ";
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

        return programDetails;
    }

}
