package ExercisePackage;

public class Balance extends Exercise {

    String equipment;


    public Balance(int intensity, int duration, int repetitions, int sets, String equipment) {
        super(intensity, duration, repetitions, sets);

        this.equipment = equipment;
    }
}



