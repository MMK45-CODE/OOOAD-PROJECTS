package EPL;

public class Player extends User{
    private String registrationNo;
    private int jerseyNo;
    private String firstName;
    private String lastName;
    private int age;
    private String Position;
    private Long profilePhoto;



    public Player() {
    }

    public Player(String registrationNo, int jerseyNo, String firstName, String lastName, int age, String position,
                  Long profilePhoto) {
        this.registrationNo = registrationNo;
        this.jerseyNo = jerseyNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        Position = position;
        this.profilePhoto = profilePhoto;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public Long getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(Long profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String toString(){
        return "Player [ " +super.toString()+ "RegistrationNo:"+ getRegistrationNo() + ",JerseyNo:" + getJerseyNo()
                + ",FirstName:" + getFirstName() + ", Lastname:" + getLastName() + ", Age:" + getAge() + ", Position:"
                + getPosition() + ", ProfilePhoto:"
                + getProfilePhoto()+ " ]";

    }





}
