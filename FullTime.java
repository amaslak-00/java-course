public class FullTime implements Student{

    private String name;
    private String surname;
    private int index;


    public FullTime(String name,String surname,int index ){
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
        if(roomNumber.equals("C124") || roomNumber.equals("D124")){
            System.out.println("Wrong room!");
        }

        if(roomNumber.equals("A123")){
            if(hour>=8 && hour<=16){
                System.out.printf("Good hour");
            }
            else{
                System.out.println("Bad hour");
            }
        }

        if(roomNumber.equals("B123")){
            if(hour>=9 && hour<=17){
                System.out.printf("Good hour");
            }
            else{
                System.out.println("Bad hour");
            }
        }
    }

}
