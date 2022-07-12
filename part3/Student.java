package part3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

    private String name;
    private String surname;

    public Student(String name, String surname) {
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

    public void displayFormat(int index, String roomNumber){

        Date nowDate = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------STUDENT " + index + "----------------------");
        System.out.println("First Name      |    " + this.getName());
        System.out.println("Second Name     |    " + this.getSurname());
        System.out.println();
        System.out.println("Raport generated on " + sdf1.format(nowDate));
        System.out.println("Room number: " + roomNumber);
        System.out.println("-------------------------------------------------------");
    }


}
