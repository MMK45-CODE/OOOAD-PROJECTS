package EPL;

public class Defender extends Player {
    private int noOfTackles;

    public Defender(){

    }

    public Defender(String registrationNo, int jerseyNo, String firstName, String lastName, int age, String position,
                    Long profilePhoto,int noOfTackles) {
        super(registrationNo, jerseyNo, firstName, lastName, age, position, profilePhoto);
        setNoOfTackles( noOfTackles);
    }

    public int getNoOfTackles() {
        return noOfTackles;
    }

    public void setNoOfTackles(int noOfTackles) {
        this.noOfTackles = noOfTackles;
    }

    public  String toString(){
        return "Defender[" + super.toString()+ "NoOfTackles:" +getNoOfTackles()+ "]";
    }
}
