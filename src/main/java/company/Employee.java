package company;

import java.math.BigDecimal;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String oib;
    private Address address;
    private BigDecimal salary;
    private Company company;
    private String phoneNumber;

    public Employee(String firstName, String lastName, int age, String oib) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.oib=oib;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "company.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", oib='" + oib + '\'' +
                ", address =" + address +
                ", salary =" + salary +
                ", works at =" + company +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
