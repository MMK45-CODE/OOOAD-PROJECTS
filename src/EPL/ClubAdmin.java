package EPL;

public class ClubAdmin extends  User{
    private String nameOfClubAdmin;
    private int clubAdminAge;

    public ClubAdmin() {
    }

    public ClubAdmin(String username, String password, String nameOfClubAdmin, int clubAdminAge) {
        super(username, password);
        this.nameOfClubAdmin = nameOfClubAdmin;
        this.clubAdminAge = clubAdminAge;
    }

    public String getNameOfClub() {
        return nameOfClubAdmin;
    }

    public void setNameOfClub(String nameOfClub) {

        this.nameOfClubAdmin = nameOfClubAdmin;
    }

    public int getClubAdminAge(){
        return clubAdminAge;
    }
    public void setClubAdminAge(int clubAdminAge){
        this.clubAdminAge=clubAdminAge;
    }

    @Override
    public String toString() {
        return "ClubAdmin{" +super.toString()+"\n"+
                "nameOfClubAdmin='" + nameOfClubAdmin + '\'' +
                ", clubAdminAge=" + clubAdminAge +
                '}';
    }
}
