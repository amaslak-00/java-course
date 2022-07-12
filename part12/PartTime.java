package part12;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PartTime  {

    private String name;
    private String surname;



    public PartTime(String name, String surname ){
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


        if(roomNumber.equals("A123") || roomNumber.equals("B123")){
            System.out.println("Wrong number");
        }

        if(roomNumber.equals("C124")){
            if(hour>=9 && hour<=13){
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------STUDENT " + index + "----------------------");
                System.out.println("First Name      |    " + this.getName());
                System.out.println("Second Name     |    " + this.getSurname());
                System.out.println();
                System.out.println("Raport generated on " + sdf1.format(nowDate));
                System.out.println("Room number: C124");
                System.out.println("-------------------------------------------------------");
            }
            else{
                System.out.println("Bad hour");
            }
        }

        if(roomNumber.equals("D124")){
            if(hour>=17 && hour<=20){
                System.out.println("-------------------------------------------------------");
                System.out.println("-------------------STUDENT " + index + "----------------------");
                System.out.println("First Name      |    " + this.getName());
                System.out.println("Second Name     |    " + this.getSurname());
                System.out.println();
                System.out.println("Raport generated on " + sdf1.format(nowDate));
                System.out.println("Room number: D124");
                System.out.println("-------------------------------------------------------");
            }
            else{
                System.out.println("Bad hour");
            }
        }
    }
}
