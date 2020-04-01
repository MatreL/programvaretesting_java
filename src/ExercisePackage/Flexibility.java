package ExercisePackage;

public class Flexibility extends Exercise {

    String equipment;

    public Flexibility(int intensity, int duration, int repetitions, int sets, String equipment) {
        super(intensity, duration, repetitions, sets);

        this.equipment = equipment;
    }
}
