package ie.atu.week11.inheritance;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer part1 = new Customer("Mark\t", "H65\t", "087\t", "1010\t", false);
        System.out.println(part1);

        Customer part2 = new Customer();
        part2.setName("Liam\t");
        part2.setAddress("H97\t");
        part2.setTelephoneNumber("085\t");
        part2.setCustomerNumber("2020\t");
        part2.setMailingList(true);
        System.out.println(part2);

        PreferredCustomer part3 = new PreferredCustomer(1280);
        part3.customerDiscount(part3.getPriceAmount());
        System.out.println(part3);
    }
}
