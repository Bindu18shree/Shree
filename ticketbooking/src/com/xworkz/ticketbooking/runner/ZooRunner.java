package com.xworkz.ticketbooking.runner;

import com.xworkz.ticketbooking.creator.ZooBooker;
import com.xworkz.ticketbooking.dto.ZooBookingDto;
import com.xworkz.ticketbooking.event.TicketBookingException;

public class ZooRunner {

    public static void main(String[] args) {

        ZooBookingDto zooBookingDto = new ZooBookingDto("Bindu", 87677654L, 1);

        ZooBooker zooBooker = new ZooBooker();

        try {
            zooBooker.buyTickets(zooBookingDto);
        } catch (TicketBookingException e) {
            e.printStackTrace();
        }

        System.out.println("This is after handling exception");
    }
}
