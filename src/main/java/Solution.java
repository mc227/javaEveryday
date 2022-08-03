/*
Adapting multiple interfaces

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
        IncomeData incomeData = new IncomeData() {
            @Override
            public String getCountryCode() {
                return "1";
            }

            @Override
            public String getCompany() {
                return "Mark Co";
            }

            @Override
            public String getContactFirstName() {
                return "Mark";
            }

            @Override
            public String getContactLastName() {
                return "Costales";
            }

            @Override
            public int getCountryPhoneCode() {
                return 1;
            }

            @Override
//            public int getPhoneNumber() {
//                return 991234567;
//            }
            public int getPhoneNumber() {
                return 991234567;
            }
        };
        Contact contact = new IncomeDataAdapter(incomeData);
//        System.out.println(contact.getPhoneNumber());
    }

    public static class IncomeDataAdapter implements Customer, Contact{
        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        // The IncomeDataAdapter class must have a private IncomeData field called data.
        private IncomeData data;

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return String.format("%s, %s", data.getContactLastName(),data.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {
            String countryCode = String.valueOf(data.getCountryPhoneCode());
            String mainPhoneNumber = String.valueOf(data.getPhoneNumber());
            if (mainPhoneNumber.length() == 10) {
                return String.format("+%s(%s)%s-%s-%s", countryCode, mainPhoneNumber.substring(0, 3),
                        mainPhoneNumber.substring(3, 6), mainPhoneNumber.substring(6, 8),
                        mainPhoneNumber.substring(8, 10));
            } else if (mainPhoneNumber.length() < 10){
                String edited = mainPhoneNumber;
                while( edited.length() < 10) {
                    edited = "0" + edited;
                }
                return String.format("+%s(%s)%s-%s-%s", countryCode, edited.substring(0, 3),
                        edited.substring(3, 6), edited.substring(6, 8),
                        edited.substring(8, 10));
            }

            return null;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Smith

        int getCountryPhoneCode();      // For example: 1

        int getPhoneNumber();           // For example: 991234567
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Smith, John

        String getPhoneNumber();        // For example: +1(099)123-45-67
    }
}