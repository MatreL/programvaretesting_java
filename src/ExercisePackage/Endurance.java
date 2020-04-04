package ExercisePackage;

public class Endurance extends Exercise {

    public Endurance(String name, String equipment, int intensity, int duration, int repetitions, int sets) {
        super(name, equipment, intensity, duration, repetitions, sets);

    }

    @Override
    public String toString() {
        return "Intensity: " + intensity + "\n" + "Duration: " + duration + "\n" + "Repetitions: " +
                repetitions + " x " + sets + "\n" + "Equipment: " + equipment;
    }
}
