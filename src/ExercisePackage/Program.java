package ExercisePackage;
import java.util.ArrayList;

public class Program {
    public ArrayList<Exercise> exercises = new ArrayList<>();
   // int duration = setDuration();
   // int intensityLevel = setIntensityLevel();
    public String programName;
    public Program(String programName){
        this.programName = programName;
    }

    public void addExercise(ArrayList<Exercise> exercises) {this.exercises=exercises;}

    public int setDuration(){
        int duration = 0;
        for (Exercise ex:exercises){
            duration += ex.duration;
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
  //  @Override
  //  public String toString(){
  //      return ("Duration is: " + duration + "\nIntensity is: " + intensityLevel);
  //  }

    @Override
    public String toString(){
        String programDetails;
        programDetails = "This is the exercises: ";
        for (Exercise ex:exercises){
            programDetails += ex.toString() +"\n\n";
        }
        return programDetails;
    }

}
