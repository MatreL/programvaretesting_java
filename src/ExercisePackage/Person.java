package ExercisePackage;

import java.util.ArrayList;

public class Person {

    private String preferredExercise;
    private int acceptableIntensity;
    private Object acceptableProgram;


    public Person(String preferredExercise, int acceptableIntensity) {
        this.acceptableIntensity = acceptableIntensity;
        this.preferredExercise = preferredExercise;

        getPreferredExercise();
        emptyString();
        emptyOrNegativeInt();
    }

    public int score = 0;

    public int exerciseIsPreffered(Program prog){
            int mellomlagring = 0;
            for (int i = 0;i<prog.getExercises().size(); i++){
                if (prog.getExercises().get(i).getType().equalsIgnoreCase(preferredExercise)){
                    mellomlagring +=1;
                }
            }
            score = mellomlagring;
            return mellomlagring;

        }

    public boolean singleProgramIsAppropiateForPerson(Program prog) {
        //return true if program is acceptable for person
        if (prog.getHighestIntensity() == acceptableIntensity ||
                prog.getHighestIntensity() == acceptableIntensity + 1 ||
                prog.getHighestIntensity() == acceptableIntensity - 1) {
            if(exerciseIsPreffered(prog)>0){
                return true;
            }
        }
        return false;
    }

    public void reccomendProgramForSinglePerson(ArrayList<Program> prog) {
        // Reccomend a program for one person
        // And set it to current program
        int programScore = 0;

        for (int i = 0; i < prog.size(); i++) {
            this.singleProgramIsAppropiateForPerson(prog.get(i));
            if (score > programScore) {
                programScore = score;
                acceptableProgram = prog.get(i).getProgramName();
            }

        }

        }
        public void printReccomendProgramForSinglePerson(){
        System.out.print("The best program is: ");
        System.out.println(acceptableProgram);
        }

    public void emptyString() {
        if (preferredExercise.equals("")) {
            throw new IllegalArgumentException("You need to write your name!");
        }
    }

    public void emptyOrNegativeInt() {
        if (acceptableIntensity <= 0 || acceptableIntensity > 10) {
            throw new IllegalArgumentException("You need to set a number between 1-10 as an acceptable intensity");
        }
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

    public String getThePreferredExercise() {
        return preferredExercise;
    }

    public int getAcceptableIntensity() {
        return acceptableIntensity;
    }

}
