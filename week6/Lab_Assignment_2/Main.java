public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("Cinepax", "Lahore", 3);
        Screen screen = new Screen(1, "The Legend of Maula Jatt", 5, 5);
        Customer customer = new Customer(101, "Muhammad Ali", "00000000000", "ali@gmail.com");
        Seat seat = new Seat(1, 1, SeatType.VIP, 1500);
        Ticket ticket = new Ticket(1, customer, 1, 1, "The Legend of Maula Jatt", 1500);

        cinema.displayCinema();
        screen.displayScreen();
        customer.displayCustomer();
        seat.display();
        ticket.displayTicket();
    }
}
