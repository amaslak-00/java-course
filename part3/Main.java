package part3;

import part12.FullTime;
import part12.PartTime;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<part12.PartTime> partTimes = new LinkedList<PartTime>();
        LinkedList<part12.FullTime> fullTimes = new LinkedList<FullTime>();

        part12.PartTime Adam = new part12.PartTime("Adam", "Kowalski");
        part12.PartTime Grzegorz = new part12.PartTime("Grzegorz", "Zbielen");
        part12.PartTime Anna = new PartTime("Anna", "Forest");

        partTimes.add(Adam);
        partTimes.add(Grzegorz);
        partTimes.add(Anna);

        part12.FullTime Stefan = new part12.FullTime("Stefan", "Kolarz");
        part12.FullTime Zosia = new part12.FullTime("Zosia", "Biel");
        part12.FullTime Eustachy = new FullTime("Eustachy", "Maslak");

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
