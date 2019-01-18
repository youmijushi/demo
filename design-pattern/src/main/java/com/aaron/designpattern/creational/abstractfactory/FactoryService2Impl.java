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
    public ProductAService createProductA() {
        return new ProductAService2Impl();
    }

    /**
     * createProductB
     *
     * @return AbstractProductB
     */
    @Override
    public ProductBService createProductB() {
        return new ProductBService2Impl();
    }
}
