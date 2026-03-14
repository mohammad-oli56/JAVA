package coustonException;

import java.util.Scanner;

public class coustomException {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        try {
            if(age>100){
                throw new  Myexception("My Exception message");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Myexception extends Exception{
    public Myexception(String message) {
        super(message);
    }
}

