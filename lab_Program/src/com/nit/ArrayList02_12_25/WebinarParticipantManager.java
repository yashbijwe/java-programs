package com.nit.ArrayList02_12_25;

import java.util.ArrayList;
import java.util.List;

public class WebinarParticipantManager {
    
	public int countParticipants(List<String> participants) {
		return participants.size();
		
	}
	
	
	public static void main(String[] args) {
		List<String> l1= new ArrayList<>();
		l1.add("A");
		l1.add("B");
		WebinarParticipantManager w1 = new WebinarParticipantManager();
		System.out.println(w1.countParticipants(l1));
	}
}
