package java.java8.optional;


import java.model.Customer;
import java.model.CustomerDatabase;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static Customer getCustomerByEmail(String email) {

        List<Customer> customers = CustomerDatabase.getAllCustomers();

        return customers.stream()
                .filter(c-> c.getEmail().equals(email))
                .findAny().orElseThrow(()-> new ArithmeticException("errorss"));

    }

    public static void main(String[] args) {

        Customer customer = new Customer(101,"john", null, Arrays.asList("232232", "23343432"));

//        empty, of, ofNullable

        //Optional<Object> emptyOptional = Optional.empty();
        //System.out.println(emptyOptional);

//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emailOptional.get());

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        //System.out.println(emailOptional2);

        //System.out.println(emailOptional2.orElse("heya"));

        //System.out.println(emailOptional2.orElseGet(()-> "good"));

        System.out.println(emailOptional2.map(String::toUpperCase).orElse("default"));

        //getCustomerByEmail("sabc");



        System.out.println(emailOptional2.orElseThrow(() -> new ArithmeticException("cheee")));
    }
}
