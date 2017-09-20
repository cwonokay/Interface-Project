public class Army extends Soldier implements Shoot, Kick{

    public Army(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String kick() {
        return "bop bop";
    }

    @Override
    public String shoot() {
        return "bang bang";
    }

    @Override
    public String speak() {
        return "Hooah";
    }

    @Override
    public String eat() {
        return "I'm eating right now";
    }

    @Override
    public String sleep() {
        return "zzzzzzz";
    }

    @Override
    public String walk() {
        return "I'm walking right now";
    }
}




