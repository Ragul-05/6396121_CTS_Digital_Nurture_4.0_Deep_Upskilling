package Design_Principles_and_Patterns.DependencyInjectionExample;

public interface CustomerRepository {
    String findCustomerById(int id);
}