package JAVA;

public class JavaMath {
    public static void main(String[] args) {
      // 1.Math.max(x,y) this methods can find highest value in two value
      System.out.println(Math.max(5, 10)); 
      //if we have more then two then we apply this method
      int a = 5;
      int b = 10;
      int c = 3;
      int d = 8;
      
      int max = Math.max(Math.max(a, b), Math.max(c, d));
      System.out.println("The maximum value is: " + max);
      

      // 2. Math. min (x,y) this methods can find lowest value in two Value
      System.out.println(Math.min(5, 10));  
      //but if we have more then two value then we apply first method


      // 3. The Math.sqrt(x) method returns the square root of x:
      System.out.println(Math.sqrt(64));

      // 4.The Math.abs(x) method returns the absolute (positive) value of x:
      System.out.println(Math.abs(-4.7));  


      // 5.Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
      System.out.println(Math.random()); 
      // 2nd method
      int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);

    // 6. add more soon
    }
  }
  