public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Inject repository into service via constructor
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Use service to get customer info
        service.getCustomerDetails("101");
    }
}
