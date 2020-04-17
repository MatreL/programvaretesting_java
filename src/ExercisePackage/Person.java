package ExercisePackage;

import java.util.ArrayList;

public class Person {

    private String preferredExercise;
    private int acceptableIntensity;
    private Object acceptableProgram;

//Construtor for the person class
    public Person(String preferredExercise, int acceptableIntensity) {
        this.acceptableIntensity = acceptableIntensity;
        this.preferredExercise = preferredExercise;

        getPreferredExercise();
        emptyString();
        emptyOrNegativeInt();
    }

    public int score = 0;
//Method to count number of preffered exercise, will run from the singleProgramIsAppropiateForPerson method
    public int exerciseIsPreferred(Program prog){
            int mellomlagring = 0;
            for (int i = 0;i<prog.getExercises().size(); i++){
                if (prog.getExercises().get(i).getType().equalsIgnoreCase(preferredExercise)){
                    mellomlagring +=1;
                }
            }
            score = mellomlagring;
            return mellomlagring;

        }
//Method to check if the intensity on the program is appropiate for the person.
//If it is, it will run the exerciseIsPrefered method
    public boolean singleProgramIsAppropriateForPerson(Program prog) {
        //return true if program is acceptable for person
        if (prog.getHighestIntensity() == acceptableIntensity ||
                prog.getHighestIntensity() == acceptableIntensity + 1 ||
                prog.getHighestIntensity() == acceptableIntensity - 1) {
            return exerciseIsPreferred(prog) > 0;
        }
        return false;
    }
//Method to check multiple programs for one person. It will loop trough the programs and select the one
// that are most appropiate
    public void recommendProgramForSinglePerson(ArrayList<Program> prog) {
        // Recommend a program for one person
        // And set it to current program
        int programScore = 0;

        for (Program program : prog) {
            this.singleProgramIsAppropriateForPerson(program);
            if (score > programScore) {
                programScore = score;
                acceptableProgram = program.getProgramName();
            }
        }

        }
    //Method to print the reccomended program for a person
        public void printRecommendProgramForSinglePerson(){
        if (acceptableProgram == null ) {
            System.out.println("There are no recommended programs..");
        } else {
            System.out.print("The best program is: " + acceptableProgram);
        }
    }
//Method to check if there are any empty string in the persons name
    public void emptyString() {
        if (preferredExercise.equals("")) {
            throw new IllegalArgumentException("You need to write your name!");
        }
    }
// Method to make sure the intensity is between 1 and 10
    public void emptyOrNegativeInt() {
        if (acceptableIntensity <= 0 || acceptableIntensity > 10) {
            throw new IllegalArgumentException("You need to set a number between 1-10 as an acceptable intensity");
        }
    }
//Method to check that the preffered exercise is one of the valid ones. Strength, balance etc.
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

    public Object getAcceptableProgram() {
        return acceptableProgram;
    }
}
