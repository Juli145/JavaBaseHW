package com.company.OOP_HW;

import static com.company.OOP_HW.Constant.PROCESSOR_INFO;

public abstract class Processor {
    double frequency;
    double cache;
    int bitCapacity;

    public Processor(double frequency, double cache, int bitCapacity){
        this.frequency = frequency;
        this.cache = cache;
        this.bitCapacity = bitCapacity;
    }

    public abstract String dataProcess(String data);
    public abstract String dataProcess(long data);

    public String getDetails() {
        return String.format(PROCESSOR_INFO, frequency, cache, bitCapacity);
    }

    public double getCache() {
        return cache;
    }
    public abstract String getArchitecture();
}
