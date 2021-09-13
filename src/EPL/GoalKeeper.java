package EPL;

public class GoalKeeper extends Player{
    private int noOfSaves;

    public GoalKeeper(){}

    public GoalKeeper(String registrationNo, int jerseyNo, String firstName, String lastName, int age, String position,
                      Long profilePhoto, int noOfSaves ) {
        super(registrationNo, jerseyNo, firstName, lastName, age, position, profilePhoto);

        setNoOfSaves(noOfSaves);
    }

    public int getNoOfSaves() {
        return noOfSaves;
    }

    public void setNoOfSaves(int noOfSaves) {
        this.noOfSaves = noOfSaves;
    }

    public String toString(){
        return "Goalkeeper["+super.toString()+ ", NoOfSaves" +getNoOfSaves()+ "]";
    }
}
