abstract class Marvel { // Abstract class
    public String universeName;
    String universeCreator = "Stan Lee";

    void UniverseName() {
        System.out.println(this.getClass());
    }
}

abstract class Avenger extends Marvel { // Abstract class
    String avengersName = "Avengers";

    abstract void SuperPower();
}

class IronMan extends Avenger { // Concrete class
    String ironManName = "Iron Man";

    @Override
    void SuperPower() {
        System.out.println("Super Power of IronMan : Genius");
        System.out.println("Super Power of IronMan : Billionare");
        System.out.println("Super Power of IronMan : Flight");
    }
}

/*
 * We dont want anyone to create an object of Marvel or Avenger.
 * But we need to mension that if someone is an Avenger they must have a super
 * power.
 * and its child class must define the abstract functions to make itself a
 * concrete class.
 */
public class Abstraction {
    public static void main(String[] args) {
        IronMan tony = new IronMan();
        tony.UniverseName();
        tony.SuperPower();
    }
}
