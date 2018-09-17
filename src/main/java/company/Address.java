package company;

public class Address {

    private String city;
    private String zipCode;
    private String streetAddress;
    private String country;
    private String county;
    private String state;

    public Address(String country, String city, String county, String streetAddress, String zipCode) {
        this.country=country;
        this.city=city;
        this.county=county;
        this.streetAddress=streetAddress;
        this.zipCode=zipCode;
    }

    public String getCounty() {
        return county;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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


}
