package Week_1_Design_Principles_and_Patterns_HandsOn.DependencyInjectionExample;

public interface CustomerRepository {
    String findCustomerById(int id);
}