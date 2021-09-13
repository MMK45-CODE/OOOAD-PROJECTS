package EPL;

public class LeagueAdmin extends User{
    private String leagueName;
    private String adminName;
    private int adminAge;

    public LeagueAdmin(){}

    public LeagueAdmin(String username, String password, String leagueName, String adminName, int adminAge ) {
        super(username, password);
        setLeagueName(leagueName);
        setAdminName(adminName);
        setAdminAge(adminAge);

    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getAdminName(){
        return  adminName;
    }

    public void  setAdminName(String adminName){
        this.adminName= adminName;
    }

    public int getAdminAge(){
        return adminAge;
    }
    public void setAdminAge(int adminAge){
        this.adminAge=adminAge;
    }

    @Override
    public String toString() {
        return "LeagueAdmin [" +super.toString() +"\n"
                +"LeagueName: "+getLeagueName()+"\n"
                +"AdminName: "+getAdminName()+"\n"
                +"AdminAge: "+getAdminAge()+"]";
    }
}


