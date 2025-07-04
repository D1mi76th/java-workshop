public class Location {
    
    private String name;
    private double latitude;
    private double longitude;
    private String postalcode;

    public String getPostalcode() {
        return postalcode;
    }

    @Override
    public String toString() {
        return "Location{name:" + name +
                ", Latitude:" + latitude +
                ", Longitude:" + longitude +
                "}";
    }       
    
    
}
