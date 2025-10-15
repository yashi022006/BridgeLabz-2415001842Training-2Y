package Interfaces;
import java.time.LocalDate;
interface Rental_Vehicle {

   int rent();
   void returnVehicle();
}
class CAR implements Rental_Vehicle{
    static int rate;
    int T_distance;
    LocalDate Return_Date;
    CAR(int T_distance,LocalDate Return_Date){
      this.T_distance=T_distance;
      this.Return_Date=Return_Date;
    }
    public int rent(){
        return T_distance*rate;
    }
    public void returnVehicle(){
        System.out.println(Return_Date);
    }
}
class Buses implements Rental_Vehicle{
    static int rate=10;
    int T_distance;
    LocalDate Return_Date;
    Buses(int T_distance,LocalDate Return_Date){
      this.T_distance=T_distance;
      this.Return_Date=Return_Date;
    }
    public int rent(){
        return T_distance*rate;
    }
    public void returnVehicle(){
        System.out.println(Return_Date);
    }
}
class Bike implements Rental_Vehicle{
    static int rate=30;
    int T_distance;
    LocalDate Return_Date;
    Bike(int T_distance,LocalDate Return_Date){
      this.T_distance=T_distance;
      this.Return_Date=Return_Date;
    }
    public int rent(){
        return T_distance*rate;
    }
    public void returnVehicle(){
        System.out.println(Return_Date);
    }
}
public class Vehicle{
    public static void main(String args[]){
        Rental_Vehicle bike=new Bike(20,LocalDate.of(2025,10,15));
        int m=bike.rent();
        System.out.println(m);
    }
}
