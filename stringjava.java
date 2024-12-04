package JAVA;

public class stringjava {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
      // 1. length method

      String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      System.out.println("The length of the txt string is: " + txt.length());



      // 2.Uppercase and lowercase methods

      String txta = "Hello World";
      System.out.println(txt.toUpperCase());
      System.out.println(txt.toLowerCase());


      // 3.Finding a Character in a String {indexof()}

      String txte = "Please locate where 'locate' occurs!";
      System.out.println(txt.indexOf("locate"));

      
      // 4.the concat() method to concatenate two strings

      String firstName = "John ";
      String lastName = "Doe";
      System.out.println(firstName.concat(lastName));


      // 5. Add more Soon
  
    }
  }
