package vitalij.task2;

public class Appl {
    public static void main(String[] args) {
//        Gadget dell16 = new Laptop("ноутбук", "Dell", 16);
//        Gadget asus32 = new Laptop("ноутбук", "Asus", 32);
//        Gadget lenovo64 = new Laptop("ноутбук", "Lenovo", 64);
        Gadget msi128 = new Laptop("ноутбук", "MSI", 128, 3);

        Gadget hp = new Laptop("компьютер", "HP", 64, 8);
//        Gadget razer = new TowerPC("компьютер", "RAZER", 128, 8);

//        dell16.printInfo();
//        asus32.printInfo();
//        lenovo64.printInfo();
        msi128.printInfo();
        hp.printInfo();
//        razer.printInfo();

        System.out.println(msi128.getUsbPorts()); // 3
        System.out.println(hp.getUsbPorts()); // 8
    }
}
