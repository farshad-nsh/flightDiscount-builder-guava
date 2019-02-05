package domain;

import domain.enums.POLICY;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * @author farshad noravesh
 * ver 1.0.0
 */
public class Request {

  private String name;
  private Calendar calendar;
  private double price;
  private double priceAfterDiscount;
  private List<POLICY> policyList;

      public  Request(String name,Calendar calendar,double price){
          this.name=name;
          this.calendar=calendar;
          this.price=price;
          policyList=new ArrayList<POLICY>();
      }

      public Request(){
          policyList=new ArrayList<POLICY>();
      }

    public String getName() {
            return name;
    }

    public Request setName(String name) {
        this.name = name;
        return this;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public Request setCalendar(Calendar calendar) {
        this.calendar = calendar;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Request setPrice(double price) {
        this.price = price;
        return this;
    }



    public Request addPolicy(POLICY policy){
      policyList.add(policy);
      return this;
    }

    public List<POLICY> getPolicyList() {
        return policyList;
    }

    public Request implementPolicies(List<POLICY> policyList){
        for (POLICY p:policyList
             ) {
            if (p.toString().equals("BYNAME")&&(name.equals("Henk"))){
                priceAfterDiscount=price-2;
                return this;
                //4=wednesday
            }else if(p.toString().equals("BYTHURSDAY")&&(calendar.get(Calendar.DAY_OF_WEEK))==5){
                priceAfterDiscount=price-2;
                return this;
            }else{
                priceAfterDiscount=price;
                return this;
            }
        }
        return this;
    }

    public double getPriceAfterDiscount() {
        return priceAfterDiscount;
    }

    public Request build() {
        implementPolicies(policyList);
        return this;
    }
}
