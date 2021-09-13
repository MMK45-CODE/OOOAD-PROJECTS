package EPL;

public class Midfielder extends Player {
    private  int noOfPassesCompleted;

    public Midfielder(){

    }

    public Midfielder(String registrationNo, int jerseyNo, String firstName, String lastName, int age, String position,
                      Long profilePhoto, int noOfPassesCompleted){
        super(registrationNo, jerseyNo, firstName, lastName, age, position, profilePhoto );

        setNoOfPassesCompleted(noOfPassesCompleted);
    }

    public int getNoOfPassesCompleted() {
        return noOfPassesCompleted;
    }

    public void setNoOfPassesCompleted(int numberOfPassesCompleted) {
        this.noOfPassesCompleted = numberOfPassesCompleted;
    }

    public String toString(){
        return "Midfielder ["+ super.toString()+ "NoOfPassesCompleted: "+ getNoOfPassesCompleted()+"]";
    }
}
