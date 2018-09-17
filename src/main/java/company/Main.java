package company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private Employee pero;
    private Employee pero2;
    private Employee josip;
    private Employee josipa;
    private Employee ana;
    private Employee drago;
    private Employee dario;

    private Address peroAddress;
    private Address dragoAddress;
    private Address konzumAddress;
    private Address lidlAddress;
    private BigDecimal lessThan5000 = new BigDecimal(4000);
    private BigDecimal moreThan5000 = new BigDecimal(5050);
    private Company companyKonzum = new Konzum();
    private Company companyLidl = new Lidl();
    private static List<Company> listOfCompanies = new ArrayList<>();


    public static void main(String[] args) {

        Main main = new Main();

        main.createAddress();

        main.createCompany();

        main.createEmployees();

        //   printWithJava8();

        for (Company c : listOfCompanies) {
            if (c instanceof Konzum) {
                for (Employee e : c.getEmployees()) {
                    if (isEmployeeFromZagreb(e) && isSalaryLessThan5000(e)) {
                        System.out.println("First name of employee " + e.getFirstName() + "\n" +
                                "Last name of employee " + e.getLastName() + "\n" +
                                "Oib: " + e.getOib() + "\n" +
                                "Have salary of: " + e.getSalary().toString() + "\n" +
                                "Works at :" + e.getCompany().getName());
                    }
                    System.out.println();
                }
            }

        }

    }

    private static void printWithJava8() {
        listOfCompanies.stream()
                .filter((company) -> company instanceof Konzum)//mogli bi filtrirati jos i po adresi konzuma
                .findFirst().get()
                .getEmployees().stream()
                .filter(konzumEmployee ->
                        isEmployeeFromZagreb(konzumEmployee) && isSalaryLessThan5000(konzumEmployee))
                .forEach(System.out::println);
    }

    private static boolean isSalaryLessThan5000(Employee employee) {
        int i = employee.getSalary().compareTo(new BigDecimal(5000));
        if (i == -1) {
            return true;
        }
        return false;
    }

    private static boolean isEmployeeFromZagreb(Employee employee) {
        return employee.getAddress().getCity().equals("Zagreb");
    }


    private void createCompany() {
        companyKonzum.setOib("67899992223");
        companyKonzum.setName("Konzum");
        companyKonzum.setAddress(konzumAddress);
        companyLidl.setOib("27869685645");
        companyLidl.setAddress(lidlAddress);
        companyLidl.setName("Lidl");
        listOfCompanies.add(companyKonzum);
        listOfCompanies.add(companyLidl);
    }

    private void createEmployees() {

        pero = new Employee("Pero", "Peric", 28, "1029887654");
        pero.setAddress(peroAddress);
        pero.setSalary(moreThan5000);
        pero.setCompany(companyKonzum);


        companyKonzum.getEmployees().add(pero);

        josip = new Employee("Josip", "", 28, "1029887654");
        josip.setAddress(peroAddress);
        josip.setSalary(lessThan5000);
        josip.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(josip);


        drago = new Employee("Drago", "", 28, "1029887654");
        drago.setAddress(dragoAddress);
        drago.setSalary(lessThan5000);
        drago.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(drago);

        josipa = new Employee("Josipa", "", 28, "1029887654");
        josipa.setAddress(peroAddress);
        josipa.setSalary(lessThan5000);
        josipa.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(josipa);

        ana = new Employee("Ana", "", 28, "1029887654");
        ana.setAddress(peroAddress);
        ana.setSalary(lessThan5000);
        ana.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(ana);

        pero2 = new Employee("Pero2", "Peric", 28, "1029887654");
        pero2.setAddress(peroAddress);
        pero2.setSalary(lessThan5000);
        pero2.setCompany(companyLidl);
        companyLidl.getEmployees().add(pero2);

        dario = new Employee("Dario", "", 28, "1029887654");
        dario.setCompany(companyLidl);
        dario.setAddress(peroAddress);
        dario.setSalary(lessThan5000);
        companyLidl.getEmployees().add(dario);
    }

    private void createAddress() {
        //pero address
        peroAddress = new Address("Croatia", "Zagreb", "Grad Zagreb", "Ilica 207", "10000");

        //drago address
        dragoAddress = new Address("Croatia", "Osijek", "Osijecko-baranjska", "Vukovarska 207", "31000");


        //company.Konzum address
        konzumAddress = new Address("Croatia", "Zagreb", "Grad Zagreb", "Ilica 231", "10000");

        //company.Lidl company.Address
        lidlAddress = new Address("Croatia", "Zagreb", "Grad Zagreb", "Nova cesta 7", "10000");

    }


}
