public abstract class LivingThing {
    protected String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println(name + " is breathing.");
    }

    public abstract void grow();
    public abstract void action();
}
