class Bird extends Animal {
    public Bird(String name) { super(name); }
    @Override
    public void grow() { System.out.println(name + " is growing by eating seeds."); }
    @Override
    public void action() { System.out.println(name + " is flying in the sky."); }
}