package java.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDatabase {

    public static List<Customer> getAllCustomers() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("3928392", "02838230")),
                new Customer(101, "smith", "smith@gmail.com", Arrays.asList("2128392", "038230")),
                new Customer(101, "adam", "adam@gmail.com", Arrays.asList("328392", "028330")),
                new Customer(101, "singh", "singh@gmail.com", Arrays.asList("39392", "0838930"))
        ).collect(Collectors.toList());
    }
}
