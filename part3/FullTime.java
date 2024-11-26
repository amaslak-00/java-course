package part3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FullTime extends Student{

    public FullTime(String name, String surname) {
        super(name, surname);
    }

    public void serve() throws myExceptions {
        Date nowDate = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        System.out.println("test");
        String roomNumber = scan.nextLine();
        System.out.println("Enter the hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter the student ID: ");
        int index = scan.nextInt();


         checkHour(hour,
                 roomNumber,
                 index);
        }

    public void checkHour(int hour, String roomNumber, int index) throws myExceptions{

        if(roomNumber.equals("A123")){
            if(hour<=8 || hour>=16){
                throw new myExceptions("Bad hour");
            }
            else{
                displayFormat(index, roomNumber);
            }
        }

        if(roomNumber.equals("B123")){
            if(hour<=9 || hour>=17){
                throw new myExceptions("Bad hour");
            }
            else{
                displayFormat(index, roomNumber);
            }
        }
        else {
            throw new myExceptions("Wrong room");
        }


    }



}
