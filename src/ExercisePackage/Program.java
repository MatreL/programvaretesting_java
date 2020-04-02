package ExercisePackage;
import java.util.ArrayList;

public class Program {
    public ArrayList<Exercise> exercises = new ArrayList<>();
    int duration;
    int intensityLevel;

    public int getDuration(){
        int duration = 0;
        for (Exercise ex:exercises){
            ex.duration += duration;
        }
        return duration;
    }
    public int getIntensityLevel(){
        int intensityLevel = 0;
        for (Exercise ex:exercises){
            ex.intensity += intensityLevel;
        }
        return intensityLevel;
    }


}
