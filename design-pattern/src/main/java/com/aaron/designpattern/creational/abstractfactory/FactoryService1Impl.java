package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class FactoryService1Impl implements FactoryService {
    /**
     * createProductA
     *
     * @return AbstractProductA
     */
    @Override
    public ProductAaService createProductA() {
        return new ProductAaService1Impl();
    }

    /**
     * createProductB
     *
     * @return AbstractProductB
     */
    @Override
    public ProductBbService createProductB() {
        return new ProductBbService1Impl();
    }
}
