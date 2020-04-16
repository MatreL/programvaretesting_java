package ExercisePackage;

public class Endurance extends Exercise {
// Constructor for endurance class
    public Endurance(String name, String equipment, int intensity, int duration, int repetitions, int sets) {
        super(name, equipment, intensity, duration, repetitions, sets);

    }
//Print method for endurance
@Override
    public String print() {
        return   "Exercise: " + name + "\nIntensity: " + intensity + "\nDuration: " + duration + "\nRepetitions: " +
            repetitions + " x " + sets + "\nEquipment: " + equipment;
    }
//Method for returning type of exercise
@Override
    public String getType(){
        return "Endurance";
    }
}
