import domain.FlightNumber;
import domain.enums.IATI;

public class Unit{

    public static void main(String[] args) {
        FlightNumber flightNumber=new FlightNumber(IATI.KLM,1234,87656);
        System.out.println("flightNumber="+flightNumber.toString());
    }

}