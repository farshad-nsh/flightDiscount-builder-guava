# flightDiscount-builder-guava
implementing builder design pattern for discount policies in flight bookings

## builder design pattern

<p> It separates the construction of a complex object from its 
representation so that the same construction process can create
 different representations. One side effect of this pattern is that 
 we can avoid mistakes associated with the construction of an object 
 with a constructor that takes too many arguments. For example 
 we can add different discount policies based on our client's need.
 This helps us avoid hard coding each day we go to the office and creates
 more resiliency in our design and development.
 
 ## enjoy beautiful and declarative code:
<p>Request request=new Request();
<p>request.setName("Henk")
<p>.setPrice(100)
<p>.setCalendar(cal1)
<p>.addPolicy(POLICY.BYNAME)
<p>.addPolicy(POLICY.BYTHURSDAY)
<p>.build();
    
 ### Isn't it familiar?
 Yes, If you look at apache camel for implementing 
 enterprise integration patterns ,you notice the dots ....
 It is beautiful and declarative. So Tomorrow you can
 create your own DSL(domain specific language) by using builder pattern
 which creates beauty and resiliency inside your code. 
 
                 
               
 
 