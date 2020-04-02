package ExercisePackage;

public class Endurance extends Exercise {

    String equipment;

    public Endurance(String name, int intensity, int duration, int repetitions, int sets, String equipment) {
        super(name, intensity, duration, repetitions, sets);

        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Intensity: " + intensity + "\n" + "Duration: " + duration + "\n" + "Repetitions: " +
                repetitions + " x " + sets + "\n" + "Equipment: " + equipment;
    }
}
