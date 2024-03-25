public class hybrid_Inheritance{
    public static void main(String args[])
    {
        peacock p1=new peacock();
        p1.fly();
        p1.eats();
        System.out.println(p1.legs);

        cat c1= new cat();
        cat.run();
        cat.eats();
        cat.bark();

        dog d1= new dog();
        dog.run();
        dog.eats();
        dog.bark();

        human h1= new human();
        human.run();
        human.eats();
        human.bark();
    }
}
class Animal{
    public static void eats()
    {
        System.out.println("eats");
    }
}
class Fish extends Animal{
   public static void swim()
   {
    System.out.println("swims");
   }
}
class tuna extends Fish{
    public static void size(){
        System.out.println("small size");
    }
}
class shark extends Fish{
    public static void size(){
        System.out.println("large size");
    }
}
class bird extends Animal{
   public static void fly()
   {
    System.out.println("flies");
   }
   int legs=2;
}
class mammal extends Animal{
   public static void run()
   {
    System.out.println("runs");
   }
    public static void legs()
   {
    System.out.println("two legs");
   }
}
class  peacock extends bird {
   public static void favourite(){
    System.out.println("favourite of lord krishna");
   }

}
class dog extends mammal{
    public static void bark()
    {
        System.out.println("bhau");
    }
}
class cat extends mammal{
    public static void bark()
    {
        System.out.println("meuw");
    }
}
class human extends mammal{
    public static void bark()
    {
        System.out.println("chutiya");
    }
}


