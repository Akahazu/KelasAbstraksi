class FloweringPlant extends Plant {
    public FloweringPlant(String name) { super(name); }
    @Override
    public void grow() { System.out.println(name + " is growing by producing flowers."); }
    @Override
    public void action() { System.out.println(name + " is producing food through photosynthesis."); }
}