package part3;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<PartTime> partTimes = new LinkedList<PartTime>();
        LinkedList<FullTime> fullTimes = new LinkedList<FullTime>();

        PartTime Adam = new PartTime("Adam", "Kowalski");
        PartTime Grzegorz = new PartTime("Grzegorz", "Zbielen");
        PartTime Anna = new PartTime("Anna", "Forest");

        partTimes.add(Adam);
        partTimes.add(Grzegorz);
        partTimes.add(Anna);

        FullTime Stefan = new FullTime("Stefan", "Kolarz");
        FullTime Zosia = new FullTime("Zosia", "Biel");
        FullTime Eustachy = new FullTime("Eustachy", "Maslak");

        fullTimes.add(Stefan);
        fullTimes.add(Zosia);
        fullTimes.add(Eustachy);

        System.out.println(fullTimes.size());


        for(int i=0; i<fullTimes.size(); i++){

            System.out.println("! You are a full time worker !");
            fullTimes.get(i).serve();

        }

        for(int i=0; i<partTimes.size(); i++){

            System.out.println("! You are a full time worker !");
            partTimes.get(i).serve();

        }
    }
}
