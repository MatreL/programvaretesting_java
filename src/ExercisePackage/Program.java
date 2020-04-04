package ExercisePackage;
import java.util.ArrayList;

public class Program {
    public ArrayList<Exercise> exercises = new ArrayList<>();
    int duration = getDuration();
 //   int intensityLevel = setIntensityLevel();
    public String programName;
    public Program(String programName){
        this.programName = programName;
    }

    public void addExercise(ArrayList<Exercise> exercises) {this.exercises=exercises;}


    public int getDuration(){
        int duration = 0;
        for (int i = 0; i<exercises.size(); i++){
            exercises.get(i).duration += duration;
        }
        return duration;
    }

    public int setIntensityLevel(){
        int intensityLevel = 0;
        for (Exercise ex:exercises){
            intensityLevel += ex.intensity;
        }
        return intensityLevel;
    }


    @Override
    public String toString(){
        String programDetails;
        int duration;
        duration = 0;
        programDetails = "This is the exercises: ";
        for (int i = 0; i<exercises.size();i++){
           duration = exercises.get(i).duration + duration;
           programDetails += "\n" + exercises.get(i) +"\n\n";
        }

        duration = duration * 2;
        programDetails += "Duration is: " + duration;

        return programDetails;
    }

}
