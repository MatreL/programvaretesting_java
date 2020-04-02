package ExercisePackage;

public class Strength extends Exercise {

    double weightsInKg;
    String equipment;

    public Strength(String name, int intensity, int duration, int repetitions, int sets, double weightsInKg, String equipment){
        super(name, intensity, duration, repetitions, sets);

        this.weightsInKg = weightsInKg;
        this.equipment = equipment;
    }


    @Override
    public String toString() {
        return "Intensity: " + intensity + "\n" + "Duration: " + duration + "\n" + "Repetitions: " +
                repetitions + " x " + sets + "\n" + "Weights: " + weightsInKg + " kg" + "\n" +
                "Equipment: " + equipment;
    }


}
