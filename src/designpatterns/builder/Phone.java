package designpatterns.builder;

/**
 * Created by nehad on 26/7/18.
 */
public class Phone {
    private String os;
    private int ram;
    private int internalStorage;
    private String processor;
    private double size;

    public Phone(String os, int ram, int internalStorage, String processor, double size) {
        this.os = os;
        this.ram = ram;
        this.internalStorage = internalStorage;
        this.processor = processor;
        this.size = size;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getInternalStorage() {
        return internalStorage;
    }

    public String getProcessor() {
        return processor;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", internalStorage=" + internalStorage +
                ", processor='" + processor + '\'' +
                ", size=" + size +
                '}';
    }

}
