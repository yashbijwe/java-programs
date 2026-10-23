package com.nit.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class BookTicket {
	
	 public static void displayUsingForEach(ArrayList<Integer> ticketId) {
	        for(Integer nm:ticketId) {
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	              
	                e.printStackTrace();
	            }
	            System.out.println(nm);
	        }
	    }
	  public static void dislayUsingTraditionalFor(ArrayList<Integer> ticketId) {
	        for(int index = 0;index<ticketId.size();index++) {
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                
	                e.printStackTrace();
	            }
	            System.out.println(ticketId.get(index));
	        }
	    }
	 public static void displayUsingIterator(ArrayList<Integer> ticketId) {
	        Iterator<Integer> itr = ticketId.iterator();
	        while(itr.hasNext()) {
	            int n = itr.next();
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                
	                e.printStackTrace();
	            }
	            System.out.println(n);
	        }
	    }
	 public static void displayDirectly(ArrayList<Integer> ticketId) {
	        System.out.println(ticketId);
	    }
	 
	public static void main(String[] args) {
		ArrayList<Integer> ticket = new ArrayList<Integer>();
		ticket.add(451561);
		ticket.add(451565);
		ticket.add(451562);
		ticket.add(451563);
		ticket.add(451564);     
		ticket.add(451566);
		ticket.add(451568);
		ticket.add(451567);
		ticket.add(451569);
		ticket.add(451545);
		
//		displayUsingForEach(ticket);
//		displayUsingIterator(ticket);
//		displayDirectly(ticket);
		dislayUsingTraditionalFor(ticket);
		     

	}

}
