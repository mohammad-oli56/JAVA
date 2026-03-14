public class Generics {
    static void main(String[] args) {
        Dog<String,Long> d1 = new Dog<>("asd345",3824L);
        Dog<Integer,String> d2 = new Dog<>(12,"skdjhasd");
        System.out.println(d1.getId()+" "+d1.getName());
        System.out.println(d2.getId()+" "+d2.getName());

        PrintData("oli");
        PrintData(323);
        PrintData(true);



    }
    static <R> void PrintData(R data){
        System.out.println(data);
    }
}

class Dog<E,V>{
   E id;
   V name;
   public Dog(E id,V name){
       this.id= id;
       this.name = name;
   }
    E getId(){
       return id;
    }
    V getName(){
       return name;
    }
}
