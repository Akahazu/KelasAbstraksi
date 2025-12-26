class NonFloweringPlant extends Plant {
    public NonFloweringPlant(String name) { super(name); }
    @Override
    public void grow() { System.out.println(name + " is growing without producing flowers."); }
    @Override
    public void action() { System.out.println(name + " is photosynthesizing without flowers."); }
}