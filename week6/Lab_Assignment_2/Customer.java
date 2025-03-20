public class Customer {
    int customerId;
    String name, phoneNumber, email;

    public Customer(int customerId, String name, String phoneNumber, String email) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public boolean equalsObj(Object obj) {
        if (obj instanceof Customer) {
            Customer c = (Customer) obj;
            return this.customerId == c.customerId;
        }
        return false;
    }

    public void displayCustomer() {
        System.out.println("Customer: " + name + " Phone: " + phoneNumber);
    }
}
