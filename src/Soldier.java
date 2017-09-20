//abstract Soldier class with a few instance variables
public abstract class Soldier {
    String name;
    String rank;
    int serialNumber;


    public Soldier() {
    }

    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }
//  common methods for the behavior and just return a String
    public String sleep(){
        return "snore";
    }
    public String eat(){
        return "chew";
    }
    public String walk(){
        return "trudge";
    }
//    an abstract method speak which returns a String.
    public abstract String speak();



}
