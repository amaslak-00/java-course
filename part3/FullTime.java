package part3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FullTime extends Student{

    public FullTime(String name, String surname) {
        super(name, surname);
    }

    public void serve(){
        Date nowDate = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        String roomNumber = scan.nextLine();
        System.out.println("Enter the hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter the student ID: ");
        int index = scan.nextInt();


        if(roomNumber.equals("C124") || roomNumber.equals("D124")){
            System.out.println("Wrong room");
        }

        if(roomNumber.equals("A123")){
            if(hour>=8 && hour<=16){
                displayFormat(index, roomNumber);
            }
            else{
                System.out.println("Bad hour");
            }
        }

        if(roomNumber.equals("B123")){
            if(hour>=9 && hour<=17){
           displayFormat(index, roomNumber);
            }
            else{
                System.out.println("Bad hour");
            }
        }
    }
}
