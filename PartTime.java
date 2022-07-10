import java.text.SimpleDateFormat;
import java.util.Date;

public class PartTime implements Student{

    private String name;
    private String surname;
    private int index;


    public PartTime(String name,String surname,int index ){
        name = name;
        surname = surname;
        index = index;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIndex() {
        return index;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public void serve(String roomNumber, int hour) {

        Date nowDate = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        if(roomNumber.equals("A123") || roomNumber.equals("B123")){
            System.out.println("Wrong room!");
        }

        if(roomNumber.equals("C124")){
            if(hour>=9 && hour<=13){
                System.out.println("-------------------------------------------------------");
                System.out.println("First Name      |    " );
                System.out.println("Second Name     |    " );
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
                System.out.println("First Name      |    " );
                System.out.println("Second Name     |    " );
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
