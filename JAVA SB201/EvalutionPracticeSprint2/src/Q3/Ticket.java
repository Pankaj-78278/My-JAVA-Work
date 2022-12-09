package Q3;

import java.util.Scanner;

public class Ticket {
    static int price;
    int ticketid;
    static int availableTickets;
    public static int calculateTicketCost(int noOfTickets){
        if(noOfTickets<availableTickets){
            System.out.println("Available tickets: "+availableTickets);
            int totalPrice= noOfTickets*price;
            System.out.println("Total amount:"+totalPrice);
            int leftTicket= availableTickets-noOfTickets;
            System.out.println("Available ticket after booking:"+leftTicket);
            return leftTicket;
        }else{
            return -1;
        }

    }

    public static void main(String[] args){
        Ticket ticket=new Ticket();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of booking");
        int bookingNo = scanner.nextInt();

        System.out.println("Enter the available tickets");
        int availableTickets=scanner.nextInt();

        for(int i=0;i<bookingNo;i++){
            System.out.println("Enter the ticketId");
            int ticketid = scanner.nextInt();
            System.out.println("Enter the price");
            int price =scanner.nextInt();
            System.out.println(" Enter the no of tickets");
            int noOfTickets= scanner.nextInt();
            Ticket.calculateTicketCost(noOfTickets);
        }

    }

}
