package company;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {

    private String oib;
    private String name;
    private List<Client> clients;
    private List<Employee> employees;
    private Address address;

    public String getOib() {
        return oib;
    }

    public Company() {
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "company.Company{" +
                "name='" + name + '\'' +
                "oib='" + oib + '\'' +
                ", address=" + address +
                '}';
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
