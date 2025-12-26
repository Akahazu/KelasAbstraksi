import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<LivingThing> list = new ArrayList<>();

        // Membuat objek sesuai gambar
        list.add(new Programmer("Alice"));
        list.add(new Doctor("Bob"));
        list.add(new Dog("Buddy"));
        list.add(new Bird("Tweety"));
        list.add(new FloweringPlant("Rose"));
        list.add(new NonFloweringPlant("Fern"));

        // Menampilkan output
        for (LivingThing lt : list) {
            // Urutan output sesuai gambar:
            // 1. Tumbuh (untuk Alice & Bob di gambar baris 1 adalah grow)
            // Namun jika ingin persis urutan per karakter:
            if (lt instanceof Human) {
                lt.grow();
                lt.action();
            } else {
                lt.breath();
                lt.grow();
                lt.action();
            }
            System.out.println(); // Spasi antar subjek
        }
    }
}