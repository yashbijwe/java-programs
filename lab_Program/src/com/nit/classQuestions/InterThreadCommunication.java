package com.nit.classQuestions;
/*two people want to use single washroom , but only person can use the washroom as only one can stay inside at a time. If
the washroom is occupied. the other person must wait outside until it becomes free.

Create a shared washroom class that maintains whether the washroom is occupied or free .Use wait()
and notify() to allow threads to wait when washroom is occupied.
create two separate threads representing two people trying to use the washroom.
print appropriate message such as: 
person 1 entered the washroom...
person 2 waiting outside...
person 3 left the room....
person 4 entered the washroom...
person 2 left the washroom...
ensure washroom will be representing the shared resource
*/

class WashRoom {
    private boolean washroomOccupied = false;

    public synchronized void useWashRoom(String user) throws InterruptedException {
       
        while (washroomOccupied) {
            System.out.println(user + " waiting outside...");
            wait();
        }

       
        try {
            System.out.println(user + " entered the washroom...");
           
            Thread.sleep(2000);
            System.out.println(user + " left the washroom...");
        } finally {
          
            washroomOccupied = false;
            notifyAll();
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        WashRoom washRoom = new WashRoom();

        Thread user1 = new Thread(() -> {
            try {
                washRoom.useWashRoom("Raju");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }, "Raju-Thread");

        Thread user2 = new Thread(() -> {
            try {
                washRoom.useWashRoom("Anil");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }, "Anil-Thread");

        user1.start();
        user2.start();

        
        try {
            user1.join();
            user2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
