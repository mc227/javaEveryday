
import java.util.HashMap;
import java.util.Map;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
        Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return null;
            }

            @Override
            public String getCountryName() {
                return null;
            }
        };
        Contact contact = new Contact() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public String getPhoneNumber() {
                return "+1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.";
            }
        };
        RowItem rowItem = new DataAdapter(customer, contact);
        System.out.println(rowItem.getDialString());
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName())) {
                    return entry.getKey();
                }
            }
            return null;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {
            // +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
//            String foo = contact.getPhoneNumber().substring(0,16);
//            String fooAllNumbers = foo.replaceAll("[^\\d.]", "");
//            return String.format("callto://+%s", fooAllNumbers);
            return "callto://+" + contact.getPhoneNumber().replaceAll("[^0-9]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Peterson

        // callto://+11112223333
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John

        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}