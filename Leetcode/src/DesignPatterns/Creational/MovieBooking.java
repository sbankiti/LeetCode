package DesignPatterns.Creational;

class MovieBooking extends BookingTickets {

    public MovieBooking(int ticknum, String bookingtyp) {
        ticketnum = ticknum;
        bookingtype = bookingtyp;
    }

    @Override
    public String booking() {
        return "Movie booking " + bookingtype + " ticket no - " + ticketnum;
    }
}

class BusBooking extends BookingTickets {

    public BusBooking(int ticknum, String bookingtyp) {
        ticketnum = ticknum;
        bookingtype = bookingtyp;
    }

    @Override
    public String booking() {

        return "Bus booking " + bookingtype + " ticket no - " + ticketnum;
    }
}

