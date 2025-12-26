class Doctor extends Human {
    public Doctor(String name) { super(name); }
    @Override
    public void grow() { System.out.println(name + " is gaining experience through practice."); }
    @Override
    public void action() { System.out.println(name + " is consulting with patients."); }
}