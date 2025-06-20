package Week_1_Design_Principles_and_Patterns_HandsOn.DependencyInjectionExample;

public class CustomerService {

    private final CustomerRepository repository;

    
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void printCustomerDetails(int id) {
        String customer = repository.findCustomerById(id);
        System.out.println( "Customer Details: " + customer);
    }
}