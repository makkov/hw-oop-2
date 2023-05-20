package com.hw.maxim;

public abstract class Transport implements Serviceable, Utilizable {

    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void util() {
        System.out.println(modelName + " Отправить под пресс");
    }
}
