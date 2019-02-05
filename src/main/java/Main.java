import domain.FlightNumber;
import domain.Request;
import domain.enums.IATI;
import domain.enums.POLICY;

import java.util.Calendar;

/**
 * @author farshad noravesh
 * ver 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        FlightNumber flightNumber=new FlightNumber(IATI.KLM,1234,87656);
        System.out.println("flightNumber="+flightNumber.toString());

        //Buy requests and discount policy at runtime
        Calendar cal = Calendar.getInstance();
        cal.set(2018,10,22);

        //5=Thu 6=Fri
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        //Request request=new Request("Henk",cal,100);
        //System.out.println(request.getName());
        //*****testing builder design pattern**********
        System.out.println("****builder pattern*****");
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2018,10,22);

        Request request=new Request();
        request.setName("Henk")
                .setPrice(100)
                .setCalendar(cal1)
                .addPolicy(POLICY.BYNAME)
                .addPolicy(POLICY.BYTHURSDAY)
                .build();


        System.out.println("size of policies="+request.getPolicyList().toArray().length);
        System.out.println("price="+request.getPrice());
        System.out.println("Calendar.DAY_OF_WEEK="+cal1.get(Calendar.DAY_OF_WEEK));
        System.out.println("PriceAfterDiscount="+request.getPriceAfterDiscount());

    }
}
