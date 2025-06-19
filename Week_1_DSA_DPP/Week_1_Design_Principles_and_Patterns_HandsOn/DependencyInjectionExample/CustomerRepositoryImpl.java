package Week_1_Design_Principles_and_Patterns_HandsOn.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        return "Customer[id=" + id + ", name=John Doe]";
    }
}