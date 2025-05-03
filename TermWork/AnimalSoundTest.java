abstract class Animal 
{
    abstract void sound();
}
class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("\tTiger roars!");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("\tDog barks!");
    }
}
public class AnimalSoundTest {
    public static void main(String[] args) {
        Animal myTiger = new Tiger();
        Animal myDog = new Dog(); 
        myTiger.sound();
        myDog.sound();
    }
}
