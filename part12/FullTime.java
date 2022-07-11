package part12;
import java.util.Scanner;
import part1.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FullTime{

    private String name;
    private String surname;



    public FullTime(String name, String surname){
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void serve() {
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
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------STUDENT " + index + "----------------------");
                System.out.println("First Name      |    " + this.getName());
                System.out.println("Second Name     |    " + this.getSurname());
                System.out.println();
                System.out.println("Raport generated on " + sdf1.format(nowDate));
                System.out.println("Room number: A123");
                System.out.println("-------------------------------------------------------");
            }
            else{
                System.out.println("Bad hour");
            }
        }

        if(roomNumber.equals("B123")){
            if(hour>=9 && hour<=17){
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------STUDENT " + index + "----------------------");
                System.out.println("First Name      |    " +this.getName());
                System.out.println("Second Name     |    " + this.getSurname());
                System.out.println();
                System.out.println("Raport generated on " + sdf1.format(nowDate));
                System.out.println("Room number: B123");
                System.out.println("-------------------------------------------------------");
            }
            else{
                System.out.println("Bad hour");
            }
        }
    }

}
