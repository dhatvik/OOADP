package Abstract_Factory_Pattern;

public class Client {
    public static void main(String []args) {
        Factory f1 = new Male();
        f1.getSport(1);
        f1.getPerson(2);
        f1.display();

        Factory f2 = new Female();
        f2.getSport(2);
        f2.getPerson(1);
        f2.display();
    }

}
