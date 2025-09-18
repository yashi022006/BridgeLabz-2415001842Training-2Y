class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String m, int seat, double p) {
        movieName = m;
        seatNumber = seat;
        price = p;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Inception", 12, 250);
        t.displayTicket();
    }
}

