package ExercisePackage;

import java.util.ArrayList;

public class Person {

    public ArrayList<Exercise> exercises = new ArrayList<>();
    public String preferredExercise;
    public int acceptableIntensity;
    public Object acceptableProgram;

    public Person(String preferredExercise, int acceptableIntensity, Object acceptableProgram) {
        this.acceptableIntensity = acceptableIntensity;
        this.preferredExercise = preferredExercise;
        this.acceptableProgram = acceptableProgram;

        getPreferredExercise();
    }

    public void getPreferredExercise() {

        String[] acceptedPrefExercise = new String[4];
        acceptedPrefExercise[0] = "balance";
        acceptedPrefExercise[1] = "endurance";
        acceptedPrefExercise[2] = "flexibility";
        acceptedPrefExercise[3] = "strength";

        String str = preferredExercise.toLowerCase();
        int i = 0;
        boolean acceptedPreferredProgram = false;

        while (!acceptedPreferredProgram || i < 4 ) {
            if (str.equals(acceptedPrefExercise[i])) {
                acceptedPreferredProgram = true;
            }
            i++;
        }

        if (preferredExercise.equals("")){
            throw new IllegalArgumentException("Preferred exercise has to be either balance, endurance," +
                    " flexibility or strength!");
        }
    }


    public void setAcceptableProgram(ArrayList<Exercise> ex) {

        boolean containsProgramWithIntensity = false;

        for (int x = 0; x < ex.size(); x++) {

            if (acceptableIntensity == ex.get(x).getIntensity() || acceptableIntensity + 1 == ex.get(x).getIntensity()
                    || acceptableIntensity - 1 == ex.get(x).getIntensity()) {

                if (preferredExercise.equals(ex.get(x).getType())) {
                    System.out.println(ex.get(x).print());
                    System.out.println("------------------------");
                }

                containsProgramWithIntensity = true;
            }
        }

        if (!containsProgramWithIntensity) {
            throw new IllegalArgumentException("There are no programs with this intensity..");
        }
    }

    public static void main(String[] args) {

        Person p1 = new Person("Strength",4,10);

        Exercise Olav = new Strength("Man one","Bench",3,30,8,4,100);
        Exercise Peder = new Flexibility("Man two","Yoga pants",9,60,10,3);
        Exercise Even = new Endurance( "Man tRe", "Shoes",5, 30, 10, 2 );
        Exercise Alex = new Balance( "Man-fire","Fitness ball", 2, 1, 15, 4);
        Exercise Erik = new Strength("Bench press","Bench",5,30,8,4,100);


        ArrayList<Exercise> exercises = new ArrayList<>();

        exercises.add(Alex);
        exercises.add(Even);
        exercises.add(Peder);
        exercises.add(Olav);
        exercises.add(Erik);


        p1.setAcceptableProgram(exercises);
    }

}
