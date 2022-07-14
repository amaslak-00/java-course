package part3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student { //TODO This class could be abstract - if we don't want to create a Student that is neither A fulltime nor part time

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
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm"); //TODO try to avoid names that do not mean anything -> later it is harder to understand the code

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------STUDENT " + index + "----------------------");
        System.out.println("First Name      |    " + this.getName());
        // TODO there should be a closing | in the table as well -> I wrote that in the instruction so that you could practice the String.format a bit
        // TODO then you could use the % for specifying the fixed length of the string e.g. %10s and a raport would not "drive apart" when a long first / last name is given
        System.out.println("Second Name     |    " + this.getSurname());
        System.out.println();
        System.out.println("Raport generated on " + sdf1.format(nowDate));
        System.out.println("Room number: " + roomNumber);
        System.out.println("-------------------------------------------------------");
    }



}
