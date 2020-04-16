package ExercisePackage;

public class Flexibility extends Exercise {
// Constructor for flexibility
    public Flexibility(String name, String equipment, int intensity, int duration, int repetitions, int sets) {
        super(name, equipment, intensity, duration, repetitions, sets);
    }

// Print method for flexibility
@Override
    public String print() {
        return   "Exercise: " + name + "\nIntensity: " + intensity + "\nDuration: " + duration + "\nRepetitions: " +
            repetitions + " x " + sets + "\nEquipment: " + equipment;
    }
//Method that returns the exercise type
@Override
    public String getType(){
        return "Flexibility";
    }

}
