package EPL;

public class Club extends User{
    private String nameOfClub;
    private String address;
    private String owner;
    private long logo;


    public Club() {

    }

    public Club(String username, String password, String nameOfClub, String address, String owner, long logo) {
        super(username, password);
        setNameOfClub(nameOfClub);
        setAddress(address);
        setOwner(owner);
        setLogo(logo);
    }



    public String getNameOfClub() {
        return nameOfClub;
    }

    public void setNameOfClub(String nameOfClub) {
        this.nameOfClub = nameOfClub;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public long getLogo() {
        return logo;
    }

    public void setLogo(long logo) {
        this.logo = logo;
    }


    @Override
    public String toString() {
        return "Club ["+ super.toString()+"\n"
                +"NameOFClub: "+getNameOfClub()+"\n"
                + "Address"+getAddress()+"\n"
                + "Owner"+getOwner()+"\n"
                + "Logo"+getLogo()+"]";
    }

}


