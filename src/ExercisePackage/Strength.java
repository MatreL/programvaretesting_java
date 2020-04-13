package ExercisePackage;

public class Strength extends Exercise {

    double weightsInKg;

    public Strength(String name, String equipment, int intensity, int duration, int repetitions, int sets, double weightsInKg){
        super(name, equipment, intensity, duration, repetitions, sets);

        this.weightsInKg = weightsInKg;
    }


@Override
    public String print() {
        return   "Exercise: " + name + "\nIntensity: " + intensity + "\nDuration: " + duration + "\nRepetitions: " +
            repetitions + " x " + sets + "\nEquipment: " + equipment;
    }
@Override
    public String getType(){
        return "Strength";
    }


}
