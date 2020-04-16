package ExercisePackage;

public class Balance extends Exercise {
//Constructor for balance exercises
    public Balance(String name, String equipment, int intensity, int duration, int repetitions, int sets) {
        super(name, equipment, intensity, duration, repetitions, sets);
    }
//Print method for balance
@Override
    public String print() {
        return   "Exercise: " + name + "\nIntensity: " + intensity + "\nDuration: " + duration + "\nRepetitions: " +
                repetitions + " x " + sets + "\nEquipment: " + equipment;
    }
// Method for returning type of exercise
@Override
    public String getType(){
        return "Balance";
}

}

