package EPL;

public class Manager extends  User{
    private String firstName;
    private String lastname;
    private int age;
    private String coachingLicenseDetails;
    private String currentTeam;
    private String previousTeam;

    public Manager() {
    }

    public Manager(java.lang.String username, java.lang.String password, String firstName, String lastname, int age,
                   String coachingLicenseDetails, String currentTeam, String previousTeam) {
        super(username, password);
        setFirstName(firstName);
        setLastname(lastname);
        setAge(age);
        setCoachingLicenseDetails(coachingLicenseDetails);
        setCurrentTeam(currentTeam);
        setPreviousTeam(previousTeam);
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastname() {
        return lastname;
    }

    public void setLastname(java.lang.String lastname) {
        this.lastname= lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public java.lang.String getCoachingLicenseDetails() {
        return coachingLicenseDetails;
    }

    public void setCoachingLicenseDetails(java.lang.String coachingLicenseDetails) {
        this.coachingLicenseDetails = coachingLicenseDetails;
    }

    public java.lang.String getCurrentTeam() {
        return currentTeam;
    }

    public void setCurrentTeam(java.lang.String currentTeam) {
        this.currentTeam = currentTeam;
    }

    public java.lang.String getPreviousTeam() {
        return previousTeam;
    }

    public void setPreviousTeam(java.lang.String previousTeam) {
        this.previousTeam = previousTeam;
    }

    @Override
    public String toString() {
        return "Manager ["+ super.toString()+"\n"
                + "FirstName " +getFirstName() +"\n"
                +"Lastname: "+getLastname()+"\n"
                +"Age: "+getAge()+"\n"
                +"CoachingLicenseDetails: "+getCoachingLicenseDetails()+"\n"
                +"CurrentTeam: "+getCurrentTeam()+"\n"
                +"PreviousTeam:"+getPreviousTeam()+"]";

    }
}
