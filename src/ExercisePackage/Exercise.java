package ExercisePackage;

public class Exercise {
    public int intensity, duration, repetitions, sets;
    public String name;

    public String printExercise() {
        return "exercise";
    }


    public Exercise(String name, int intensity, int duration, int repetitions, int sets) {
        this.name = name;
        this.intensity = intensity;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Intesiteten på treningen er:" + intensity + " Varigheten er: " + duration + " " + repetitions + " " + sets;
    }
}