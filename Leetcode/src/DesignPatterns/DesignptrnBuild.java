package DesignPatterns;

import DesignPatterns.Creational.BookingTickets;
import DesignPatterns.Creational.Factory;

public class DesignptrnBuild {

    public void build() {

        //Factory design pattern example
        Factory ft = new Factory();
        BookingTickets boktic = ft.getTickets("Movie", 10, "online");
        System.out.println("Factory design pattern output " + boktic.booking());
    }
}
