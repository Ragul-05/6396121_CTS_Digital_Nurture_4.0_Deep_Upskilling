package Week_1_Design_Principles_and_Patterns_HandsOn.DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {

        CustomerRepository repo = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repo);

        service.printCustomerDetails(101);
    }
}