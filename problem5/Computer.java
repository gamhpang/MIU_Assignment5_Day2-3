package problem5;

import java.util.Objects;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer,String processor,int ramSize,double processorSpeed){
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize(){
        return ramSize;
    }

    public double getProcessorSpeed(){
        return processorSpeed;
    }

    public double computePower(){
        return ramSize*processorSpeed;
    }

    @Override
    public String toString() {
        return "Manufacturer='" + manufacturer + '\'' +
                ", Processor='" + processor + '\'' +
                ", RamSize=" + ramSize +
                ", ProcessorSpeed=" + processorSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(obj==null || getClass()!= obj.getClass()){
            return false;
        }

        Computer comp = (Computer) obj;
        return Objects.equals(manufacturer,comp.manufacturer) &&Objects.equals(processor,comp.processor)&&ramSize == comp.ramSize && processorSpeed == comp.processorSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer,processor,ramSize,processorSpeed);
    }
}
