package company;

public class Address {

    private String city;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private String zipCode;
    private String streetAddress;
    private String country;

    public String getCounty() {
        return county;
    }

    @Override
    public String toString() {
        return "company.Address{" +
                "city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", country='" + country + '\'' +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void setCounty(String county) {
        this.county = county;
    }

    private String county;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String state;


}
