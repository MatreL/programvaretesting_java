package ExercisePackage;

public class Strength extends Exercise {
//Extra variable that is needed for the strength exercises
    double weightsInKg;
//Constructor for strength
    public Strength(String name, String equipment, int intensity, int duration, int repetitions, int sets, double weightsInKg){
        super(name, equipment, intensity, duration, repetitions, sets);

        this.weightsInKg = weightsInKg;
    }

//Print method for strength class
@Override
    public String print() {
        return   "Exercise: " + name + "\nIntensity: " + intensity + "\nDuration: " + duration + "\nRepetitions: " +
            repetitions + " x " + sets + "\nEquipment: " + equipment + "\nWeights: " + weightsInKg;
    }
//Method to return the exercise type
@Override
    public String getType(){
        return "Strength";
    }


}
