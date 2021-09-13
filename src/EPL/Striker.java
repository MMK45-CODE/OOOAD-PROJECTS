package EPL;

public class Striker extends Player {
    private int noOfGoals;

    public Striker(){

    }

    public Striker(String registrationNo, int jerseyNo, String firstName, String lastName, int age, String position,
                   Long profilePhoto, int noOfGoals) {
        super(registrationNo, jerseyNo, firstName, lastName, age, position, profilePhoto);
        setNoOfGoals(noOfGoals);
    }

    public int getNoOfGoals() {
        return noOfGoals;
    }

    public void setNoOfGoals(int noOfGoals) {
        this.noOfGoals = noOfGoals;
    }

    @Override
    public String toString() {
        return "Striker{" +super.toString()+
                "noOfGoals=" + noOfGoals +
                '}';
    }
}
