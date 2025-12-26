class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override
    public void grow() { System.out.println(name + " is growing by eating and exercising."); }
    @Override
    public void action() { System.out.println(name + " is running on four legs."); }
}