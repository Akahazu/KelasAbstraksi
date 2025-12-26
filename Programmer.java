public class Programmer extends Human {
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void grow() {
        System.out.println(name + " is learning new programming languages to grow intellectually.");
    }

    @Override
    public void action() {
        System.out.println(name + " is explaining coding concepts.");
    }
}