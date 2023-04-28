package Abstract_Factory_Pattern;

public class Male extends Factory{
    Sport s;
    Person p;

    @Override
    public void getSport(int ch) {
        if(ch==1) {
            s = new IndoorRegular("Indoor Regular");
        }
        if(ch==2) {
            s = new OutdoorRegular("Outdoor Regular");
        }
        if(ch==3) {
            s = new OutdoorAdventure("Outdoor Adventure");
        }
    }

    @Override
    public void getPerson(int ch) {
        if(ch==1) {
            p = new DifferentlyAbled("Differently Abled");
        }
        if(ch==2) {
            p = new Abled("Abled");
        }
    }

    @Override
    public void display() {
        System.out.println("Sport: "+s.name+"\nPerson: "+p.name + "\nGender : Male");
    }
}
