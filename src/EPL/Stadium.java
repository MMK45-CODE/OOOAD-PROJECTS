package EPL;

public class Stadium extends Club {
    private String nameOfStadium;
    private String location;
    private int capacity;
    private String yearOpened;
    private double pitchDimensions;

    public Stadium() {
    }



    public Stadium(String username, String password, String nameOfClub, String address, String owner, long logo,
                   String nameOfStadium, String location, int capacity, String yearOpened, double pitchDimensions) {
        super(username, password, nameOfClub, address, owner, logo);
        this.nameOfStadium = nameOfStadium;
        this.location = location;
        this.capacity = capacity;
        this.yearOpened = yearOpened;
        this.pitchDimensions = pitchDimensions;
    }

    public String getNameOfStadium() {
        return nameOfStadium;
    }

    public void setNameOfStadium(String nameOfStadium) {
        this.nameOfStadium = nameOfStadium;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getYearOpened() {
        return yearOpened;
    }

    public void setYearOpened(String yearOpened) {
        this.yearOpened = yearOpened;
    }

    public double getPitchDimensions() {
        return pitchDimensions;
    }

    public void setPitchDimensions(double pitchDimensions) {
        this.pitchDimensions = pitchDimensions;
    }

    @Override
    public String toString() {
        return "Stadium{"+super.toString() +"\n"+
                "nameOfStadium='" + nameOfStadium + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", yearOpened='" + yearOpened + '\'' +
                ", pitchDimensions=" + pitchDimensions +
                '}';
    }
}
