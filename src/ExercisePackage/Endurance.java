package ExercisePackage;

public class Endurance extends Exercise {

    String equipment;

    public Endurance(int intensity, int duration, int repetitions, int sets){
        super(intensity, duration, repetitions, sets);

        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Intensity:" + intensity + "\n" + "Duration: " + duration + "\n" + "Repetitions: " +
                repetitions + ", Sets" + sets + "\n" + "Equipment: " + equipment;
}
