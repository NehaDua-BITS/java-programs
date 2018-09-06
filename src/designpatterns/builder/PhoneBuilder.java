package designpatterns.builder;

/**
 * Created by nehad on 26/7/18.
 */
public class PhoneBuilder {
    private String os;
    private int ram;
    private int internalStorage;
    private String processor;
    private double size;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setInternalStorage(int internalStorage) {
        this.internalStorage = internalStorage;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setSize(double size) {
        this.size = size;
        return this;
    }

    public Phone getPhone()
    {
        return new Phone(os, ram, internalStorage, processor, size);
    }
}
