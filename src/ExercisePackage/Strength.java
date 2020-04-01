package ExercisePackage;

public class Strength extends Exercise {

    int weightsInKg;
    String equipment;

    public Strength(int intensity, int duration, int repetitions, int sets, int weightsInKg, String equipment){
        super(intensity, duration, repetitions, sets);

        this.weightsInKg = weightsInKg;
        this.equipment = equipment;
    }


    @Override
    public String toString() {
        return "Intensity:" + intensity + "\n" + "Duration: " + duration + "\n" + "Repetitions: " +
                repetitions + ", Sets" + sets + "\n" + "Weights: " + weightsInKg + " kg" + "\n" +
                "Equipment: " + equipment;
    }


}
