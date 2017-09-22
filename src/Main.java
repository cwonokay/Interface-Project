public class Main {
    public static void main(String[] args) {
        Army army = new Army("Jane", "Private", 4422);


        System.out.println("My name is " + " " + army.name + " " + "my rank is" + " " + army.rank + " " + "and my serial number is" + " " + army.serialNumber);
        System.out.println(army.eat());
        System.out.println(army.walk());
        System.out.println(army.sleep());
        System.out.println(army.shoot());
        System.out.println(army.kick());
        System.out.println(army.speak());

        Navy navy = new Navy("Jennie", "Sailor4", 4444);
        System.out.println("My name is Private" + " " + navy.name + " " + "my rank is" + " " + navy.rank + " " + "and my serial number is" + " " + navy.serialNumber);
        System.out.println(navy.eat());
        System.out.println(navy.walk());
        System.out.println(navy.sleep());
        System.out.println(navy.shoot());
        System.out.println(navy.kick());
        System.out.println(navy.speak());

        Marines  marine = new  Marines("Joey", "E1", 2244);
        System.out.println("My name is Private" + " " + marine.name + " " + "my rank is an" + " " + marine.rank + " " + "and my serial number is" + " " + marine.serialNumber);
        System.out.println(marine.eat());
        System.out.println(marine.walk());
        System.out.println(marine.sleep());
        System.out.println(marine.shoot());
        System.out.println(marine.kick());
        System.out.println(marine.speak());

        Bomb bomb = new Bomb("Mega Bomb", "Super4", 435678689);
        System.out.println(bomb.toString());

    }
}



