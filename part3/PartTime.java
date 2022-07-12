package part3;

import java.util.Scanner;

public class PartTime extends Student{
    public PartTime(String name, String surname) {
        super(name, surname);
    }

    public void serve(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        String roomNumber = scan.nextLine();
        System.out.println("Enter the hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter the student ID: ");
        int index = scan.nextInt();


        if(roomNumber.equals("A123") || roomNumber.equals("B123")){
            System.out.println("Wrong number");
        }

        if(roomNumber.equals("C124")){
            if(hour>=9 && hour<=13){
                displayFormat(index, roomNumber);
            }
            else{
                System.out.println("Bad hour");
            }
        }

        if(roomNumber.equals("D124")){
            if(hour>=17 && hour<=20){
                displayFormat(index, roomNumber);
            }
            else{
                System.out.println("Bad hour");
            }
        }
    }
}
