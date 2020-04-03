package ExercisePackage;

public class Exercise {
    public int intensity, duration, repetitions, sets;
    public String name;

    public String printExercise() {
        return "exercise";
    }


    public Exercise(String name, int intensity, int duration, int repetitions, int sets) throws IllegalArgumentException {
        this.name = name;
        this.intensity = intensity;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;

        if (name.equals("") || intensity <= 0 || intensity > 10 || duration == 0 || repetitions == 0 || sets == 0){
            throw new IllegalArgumentException("Invalid value");
        }

    }


    @Override
    public String toString() {
        return "Intesiteten på treningen er:" + intensity + " Varigheten er: " + duration + " " + repetitions + " " + sets;
    }
}