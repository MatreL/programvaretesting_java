package ExercisePackage;

public class Exercise {
    public int intensity, duration, repetitions, sets;
    public String name, equipment;


    public Exercise(String name, String equipment, int intensity, int duration, int repetitions, int sets) {
        this.name = name;
        this.equipment = equipment;
        this.intensity = intensity;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;

        emptyString();
        emptyInt();
        emptyOrInvalidIntensity();

    }

    public void emptyString() {
        if (name.equals("")) {
            throw new IllegalArgumentException("You need to give the exercise a name!");
        } else if (equipment.equals("")) {
            throw new IllegalArgumentException("You need to give the exercise equipment!");
        }
    }

    public void emptyInt(){
        String valueMissing = "";

        if (duration <= 0) {
            valueMissing = "a duration";
        } else if (repetitions <= 0) {
            valueMissing = "repetitions";
        } else if (sets <= 0) {
            valueMissing = "sets";
        }

        if (!valueMissing.equals("")) {
            throw new IllegalArgumentException("You have to set " + valueMissing + " to the exercise!");
        }
    }

    public void emptyOrInvalidIntensity(){

        if (intensity < 1 || intensity > 10) {
            throw new IllegalArgumentException("The value of the intensity has to be between 1 and 10.");
        }
    }



}