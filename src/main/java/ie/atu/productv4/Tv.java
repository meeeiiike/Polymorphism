package ie.atu.productv4;

public class Tv extends Product{
    private String screenSize;
    private String manufacturer;

    public Tv() {
        super();
        screenSize = "";
        manufacturer = "";
        count++;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return super.toString() + " TV " +
                screenSize + " made by " +
                manufacturer;
    }
}
