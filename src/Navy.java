public class Navy extends Soldier implements Shoot, Kick{
    public Navy(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String kick() {
        return "kick kick";
    }

    @Override
    public String shoot() {
        return "bang bang bang";
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




