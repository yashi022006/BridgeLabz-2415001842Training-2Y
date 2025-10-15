package Interfaces;

interface Smartdevice{
    void turnoff();
    void turnon();
}
class Lights implements Smartdevice{
    public void turnoff(){
        System.out.println("Your Lights is  Off");
    }
    public void turnon(){
        System.out.println("Your Lights is On");
    }
}
class AC implements Smartdevice{
    public void turnoff(){
        System.out.println("Your AC is Off");
    }
    public void turnon(){
        System.out.println("Your AC is On");
    }
}
class TV implements Smartdevice{
    public void turnoff(){
        System.out.println("Your TV is Off");
    }
    public void turnon(){
        System.out.println("Your TV is On");
    }
}
public class Devices{
    public static void main(String[] args) {
        TV T1=new TV();
        T1.turnoff();
    }
}
