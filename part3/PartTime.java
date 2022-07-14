package part3;

import java.util.Scanner;

public class PartTime extends Student{
    public PartTime(String name, String surname) {
        super(name, surname);
    }

    //TODO As you mentioned when we talked -> there is a lot of code duplication here, it would be a better practice to keep the logic in one place
    // and only call the proper method with the proper parameters

    public void serve() throws myExceptions {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        String roomNumber = scan.nextLine();
        System.out.println("Enter the hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter the student ID: ");
        int index = scan.nextInt();

        //TODO useless new line
        checkHour(hour, roomNumber, index);
    }

    public void checkHour(int hour, String roomNumber, int index) throws myExceptions{

        if(roomNumber.equals("D124")){
            if(hour<=17 ||hour>=20){
                throw new myExceptions("Bad hour");
            }
            else{
                displayFormat(index, roomNumber);
            }
        }

        if(roomNumber.equals("C124")){
            if(hour<=9 ||hour>=13){
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
