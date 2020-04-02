package ExercisePackage;

public class Balance extends Exercise {

    String equipment;


    public Balance(String name, int intensity, int duration, int repetitions, int sets, String equipment) {
        super(name, intensity, duration, repetitions, sets);

        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Intensity: " + intensity + "\n" + "Duration: " + duration + "\n" + "Repetitions: " +
                repetitions + " x " + sets + "\n" +
                "Equipment: " + equipment;
    }

}

