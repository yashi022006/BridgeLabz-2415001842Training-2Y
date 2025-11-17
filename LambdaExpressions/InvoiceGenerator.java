import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String id;

    Invoice(String id) {
        this.id = id;
    }

    public String toString() {
        return "Invoice generated for Transaction: " + id;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN111", "TXN222", "TXN333");

        List<Invoice> invoices =
                transactionIds.stream()
                        .map(Invoice::new)     // constructor reference
                        .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
