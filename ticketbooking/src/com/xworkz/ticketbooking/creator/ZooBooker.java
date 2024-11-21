package com.xworkz.ticketbooking.creator;

import com.xworkz.ticketbooking.dto.ZooBookingDto;
import com.xworkz.ticketbooking.event.TicketBookingException;

public class ZooBooker{



    public void buyTickets(ZooBookingDto zooBookingDto) throws TicketBookingException{

        String name = zooBookingDto.getCustomerName();
        long mobileNumber = zooBookingDto.getMobileNo();
        int numberOfTickets = zooBookingDto.getNoOfTickets();


        if (name.length()<4 || String.valueOf(mobileNumber).length()<10 || numberOfTickets < 1){

            throw new TicketBookingException();
        }

        else {

            System.out.println("Valid information");

        }


    }
}
