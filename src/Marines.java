public class Marines extends Soldier implements Shoot, Kick{

    public Marines (String name, String rank, int serialNumber) {

        super(name, rank, serialNumber);
    }


    @Override
    public String kick() {
        return "kick kick kick";
    }

    @Override
    public String shoot() {
        return "click clack bang";
    }

    @Override
    public String speak() {
        return "orrah";
    }

    @Override
    public String eat() {
        return "chew chew";
    }

    @Override
    public String sleep() {
        return "zzzzzzz";
    }

    @Override
    public String walk() {
        return "walking";
    }
}


