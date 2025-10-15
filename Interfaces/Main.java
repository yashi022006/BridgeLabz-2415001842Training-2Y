package Interfaces;

class Calculator {
    int base;  

    Calculator(int base) {   
        this.base = base;
    }

    int multiply(int n) {    
        return base * n;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(5);
        System.out.println(c.multiply(10));  
        System.out.println(c.multiply(3));   
    }
}

