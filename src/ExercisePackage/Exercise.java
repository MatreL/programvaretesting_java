package ExercisePackage;

public class Exercise {
    public int intensity, duration, repetitions, sets;
    public String name;


    public Exercise(String name, int intensity, int duration, int repetitions, int sets) throws IllegalArgumentException {
        this.name = name;
        this.intensity = intensity;
        this.duration = duration;
        this.repetitions = repetitions;
        this.sets = sets;

        emptyString();
        emptyInt();
        emptyOrInvalidIntensity();

        /* Makes if-statement to secure that it wont include valid values
        if (name.equals("") || intensity <= 0 || intensity > 10 || duration <= 0 || repetitions <= 0 || sets <= 0){
            throw new IllegalArgumentException("Invalid value");
        }*/
    }

    public void emptyString() {
        if (name.equals("")) {
            throw new IllegalArgumentException("You need to give the exercise a name!");
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