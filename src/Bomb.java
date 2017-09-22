
public class Bomb extends Soldier {
    public Bomb(String name, String rank, int serviceNumber) {
        super( name, rank, serviceNumber );
    }

    public String toString(){
        return "Booooooooooom ";
    }


    @Override
    public String speak() {
        return "Bomb{take over}";
    }
}