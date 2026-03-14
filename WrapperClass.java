public class WrapperClass {
    static void main(String[] args) {
        Integer obj = new Integer(13);
        System.out.println(obj.toString());
        Integer obj2 = 12 ;//autoboxing
        System.out.println(obj2.toString());
        int age = obj; //unboxing
        System.out.println(age);
        Integer obj3 = Integer.valueOf("30"); // Value off string k int convert kore fala
        Integer d2 = obj3*4;
        System.out.println(d2);
    }
}
