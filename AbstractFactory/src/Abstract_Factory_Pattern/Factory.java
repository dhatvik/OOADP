package Abstract_Factory_Pattern;

abstract class Factory {

    public Factory () {
        System.out.println("....................Factory has been instantiated...............");
    }

    public abstract void getSport(int ch);
    public abstract void getPerson(int ch);
    public abstract void display();

}
