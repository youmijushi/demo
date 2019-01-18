package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class Environment {
    /**
     * abstractProductA
     *
     */
    private ProductAService abstractProductA;
    /**
     * abstractProductB
     *
     */
    private ProductBService abstractProductB;

    /**
     * Environment
     *
     * @param factory
     */
    public Environment(FactoryService factory) {
        abstractProductA = factory.createProductA();
        abstractProductB = factory.createProductB();
    }

    /**
     * run
     *
     */
    public void run() {
        abstractProductB.interact(abstractProductA);
    }
}
