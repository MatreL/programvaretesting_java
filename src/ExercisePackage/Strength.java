package ExercisePackage;

public class Strength extends Exercise {

    double weightsInKg;

    public Strength(String name, String equipment, int intensity, int duration, int repetitions, int sets, double weightsInKg){
        super(name, equipment, intensity, duration, repetitions, sets);

        this.weightsInKg = weightsInKg;
    }


    @Override
    public String toString() {
        return "Intensity: " + intensity + "\n" + "Duration: " + duration + "\n" + "Repetitions: " +
                repetitions + " x " + sets + "\n" + "Weights: " + weightsInKg + " kg" + "\n" +
                "Equipment: " + equipment;
    }


}
