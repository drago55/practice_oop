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
    private Salary lessThan5000= new Salary(new BigDecimal(4000));
    private Salary moreThan5000= new Salary(new BigDecimal(5050));
    private Company companyKonzum = new Konzum();
    private Company companyLidl= new Lidl();
    private static List<Company> listOfCompany=  new ArrayList<>();


    public static void main(String[] args) {

        Main main = new Main();

        main.createAddress();

        main.createCompany();

        main.createEmployees();

        listOfCompany.stream()
                .filter((company) -> company instanceof Konzum)//mogli bi filtrirati jos i po adresi konzuma
                .findFirst().get()
                .getEmployees().stream()
                .filter(konzumEmployee ->
                        isEmployeeFromZagreb(konzumEmployee) && isSalaryLessThan5000(konzumEmployee))
                .forEach(System.out::println);


    }
    private static boolean isSalaryLessThan5000(Employee employee){
       int i= employee.getSalary().getAmount().compareTo(new BigDecimal(5000));
        if(i==-1){
            return true;
        }
        return false;
    }

    private static boolean isEmployeeFromZagreb(Employee employee) {
        return employee.getAddress().getCity().equals("Zagreb");
    }


    private void createCompany(){
        companyKonzum.setOib("67899992223");
        companyKonzum.setAddress(konzumAddress);
        companyLidl.setOib("27869685645");
        companyLidl.setAddress(lidlAddress);
        listOfCompany.add(companyKonzum);
        listOfCompany.add(companyLidl);
    }

    private void createEmployees(){

        pero =  new Employee();
        pero.setFirstName("Pero");
        pero.setLastName("Peric");
        pero.setAge(28);
        pero.setOib("1029887654");
        pero.setAddress(peroAddress);
        pero.setSalary(moreThan5000);
        pero.setCompany(companyKonzum);


        companyKonzum.getEmployees().add(pero);

        josip =  new Employee();
        josip.setFirstName("Josip");
        josip.setLastName("");
        josip.setAge(28);
        josip.setOib("1029887654");
        josip.setAddress(peroAddress);
        josip.setSalary(lessThan5000);
        josip.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(josip);


        drago =  new Employee();
        drago.setFirstName("Drago");
        drago.setLastName("");
        drago.setAge(28);
        drago.setOib("1029887654");
        drago.setAddress(dragoAddress);
        drago.setSalary(lessThan5000);
        drago.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(drago);

        josipa =  new Employee();
        josipa.setFirstName("Josipa");
        josipa.setLastName("");
        josipa.setAge(28);
        josipa.setOib("1029887654");
        josipa.setAddress(peroAddress);
        josipa.setSalary(lessThan5000);
        josipa.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(josipa);

        ana =  new Employee();
        ana.setFirstName("Ana");
        ana.setLastName("");
        ana.setAge(28);
        ana.setOib("1029887654");
        ana.setAddress(peroAddress);
        ana.setSalary(lessThan5000);
        ana.setCompany(companyKonzum);

        companyKonzum.getEmployees().add(ana);

        pero2 =  new Employee();
        pero2.setFirstName("Pero2");
        pero2.setLastName("Peric");
        pero2.setAge(28);
        pero2.setOib("1029887654");
        pero2.setAddress(peroAddress);
        pero2.setSalary(lessThan5000);
        pero2.setCompany(companyLidl);
        companyLidl.getEmployees().add(pero2);

        dario =  new Employee();
        dario.setCompany(companyLidl);
        dario.setFirstName("Dario");
        dario.setLastName("");
        dario.setAge(28);
        dario.setAddress(peroAddress);
        dario.setOib("1029887634");
        dario.setSalary(lessThan5000);
       companyLidl.getEmployees().add(dario);
    }

    private  void createAddress(){
        //pero address
        peroAddress = new Address();
        peroAddress.setCity("Zagreb");
        peroAddress.setCountry("Croatia");
        peroAddress.setState("");
        peroAddress.setCounty("Grad Zagreb");
        peroAddress.setStreetAddress("Ilica 207");
        peroAddress.setZipCode("10000");
        //drago address
        dragoAddress= new Address();
        dragoAddress.setCity("Osijek");
        dragoAddress.setCountry("Croatia");
        dragoAddress.setState("");
        dragoAddress.setCounty("Osijecko-baranjska");
        dragoAddress.setStreetAddress("Vukovarska 207");
        dragoAddress.setZipCode("31000");

        //company.Konzum address
        konzumAddress = new Address();
        konzumAddress.setStreetAddress("Ilica 231");
        konzumAddress.setCountry("Croatia");
        konzumAddress.setZipCode("10000");
        konzumAddress.setCounty("Grad Zagreb");

        //company.Lidl company.Address
        lidlAddress= new Address();
        lidlAddress.setZipCode("10000");
        lidlAddress.setCountry("Croatia");
        lidlAddress.setCity("Zagreb");
        lidlAddress.setStreetAddress(" Nova cesta 7");

    }


}
