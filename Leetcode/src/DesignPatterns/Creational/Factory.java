package DesignPatterns.Creational;

public class Factory {


    public BookingTickets getTickets( String type, int tickets, String bookingtype){

        if("Movie".equalsIgnoreCase(type))
        {
            return  new MovieBooking(tickets,bookingtype);
        } else if ("Bus".equalsIgnoreCase(type)) {
            return new BusBooking(tickets,bookingtype);
        }
        else
            return new BookingTickets() {
                @Override
                public String booking() {
                    return null;
                }
            };
    }
}
