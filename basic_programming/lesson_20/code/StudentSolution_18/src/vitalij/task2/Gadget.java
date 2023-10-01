package vitalij.task2;

public class Gadget {
    private String type;
    private String brand;

    private int ramCapacity;

    private int usbPorts;

    public Gadget(String type, String brand, int ramCapacity, int usbPorts) {
        this.type = type;
        this.brand = brand;
        this.ramCapacity = ramCapacity;
        this.usbPorts = usbPorts;
    }

    public int getUsbPorts() {
        return usbPorts;
    }

    public void printInfo() {
        System.out.println("Тип устройства: " + this.type
                + ", марка: " + this.brand
                + ", объем памяти: " + this.ramCapacity + " Gb.");
    }
}
