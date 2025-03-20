public class Screen {
    int screenNumber;
    String movieTitle;
    Seat[][] seats;

    public Screen(int screenNumber, String movieTitle, int rows, int cols) {
        this.screenNumber = screenNumber;
        this.movieTitle = movieTitle;
        this.seats = new Seat[rows][cols];
    }

    public boolean bookSeat(int row, int col, Customer customer) {
        if (!seats[row][col].isBooked) {
            seats[row][col].isBooked = true;
            return true;
        }
        return false;
    }

    public void displayScreen() {
        System.out.println("Screen: " + screenNumber + " Movie: " + movieTitle);
    }
}
