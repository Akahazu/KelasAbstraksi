public abstract class LivingThing {
    protected String name;

    public LivingThing(String name) {
        this.name = name;
    }

    public void breath() {
        System.out.println(name + " is breathing.");
    }

    // Metode ini wajib diimplementasikan oleh subclass terakhir
    public abstract void grow();
    public abstract void action();
}