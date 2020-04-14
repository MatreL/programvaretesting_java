package ExercisePackage;

public class Balance extends Exercise {

    public Balance(String name, String equipment, int intensity, int duration, int repetitions, int sets) {
        super(name, equipment, intensity, duration, repetitions, sets);
    }

@Override
    public String print() {
        return   "Exercise: " + name + "\nIntensity: " + intensity + "\nDuration: " + duration + "\nRepetitions: " +
                repetitions + " x " + sets + "\nEquipment: " + equipment;
    }
@Override
    public String getType(){
        return "Balance";
}

}

