package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class FactoryService2Impl implements FactoryService {
    /**
     * createProductA
     *
     * @return AbstractProductA
     */
    @Override
    public ProductAaService createProductA() {
        return new ProductAaService2Impl();
    }

    /**
     * createProductB
     *
     * @return AbstractProductB
     */
    @Override
    public ProductBbService createProductB() {
        return new ProductBbService2Impl();
    }
}
