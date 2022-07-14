package part3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FullTime extends Student{

    public FullTime(String name, String surname) {
        super(name, surname);
    }

    public void serve() throws myExceptions { // TODO What happens here in this method does is not actually connected to the Student -> more a class responsible for user input,
        // so it would be better to keep this method in the other class -> e.g. Main class and only call the serve method with correct parameters
        Date nowDate = new Date(); // TODO not used -> I guess you forgot to delete it
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the room number: ");
        String roomNumber = scan.nextLine();
        System.out.println("Enter the hour: ");
        int hour = scan.nextInt();
        System.out.println("Enter the student ID: "); //TODO this part here is a bit useless in the structure that you provided
        // -> you are already in the Student class so you should use the ID of the current student an ID of the student should be a protected variable to enable the access from here
        int index = scan.nextInt();


     checkHour(hour,
             roomNumber,
             index); //TODO this new-lines formatting is pointless -> it could stay in one line
    }

    public void checkHour(int hour, String roomNumber, int index) throws myExceptions{

        if(roomNumber.equals("A123")){
            // TODO It is good that you specified which room is related to this type of student, but it would be a better practice to extract a Room as a new class - or better - an enum
            // then each Room e.g. A123 could keep the information about the opening and closing hour in itself
            if(hour<=8 || hour>=16){
                throw new myExceptions("Bad hour");
            }
            else{
                displayFormat(index, roomNumber);
            }
        }

        //TODO those lines above and under look basically equal - only room id and hours values differ
        // it would be better then to extract a new method and provide the info as parameters in that situation -> but look at the comment above for the better approach here
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
