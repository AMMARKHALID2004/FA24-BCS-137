public class Ticket {
    int ticketId, screenNumber, seatNumber;
    Customer customer;
    String movieTitle;
    double price;

    public Ticket(int ticketId, Customer customer, int screenNumber, int seatNumber, String movieTitle, double price) {
        this.ticketId = ticketId;
        this.customer = customer;
        this.screenNumber = screenNumber;
        this.seatNumber = seatNumber;
        this.movieTitle = movieTitle;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Ticket: " + ticketId + " Movie: " + movieTitle + " Seat: " + seatNumber);
    }
}
