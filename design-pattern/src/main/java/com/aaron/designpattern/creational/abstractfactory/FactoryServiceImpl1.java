package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class FactoryServiceImpl1 implements FactoryService {
    /**
     * createProductA
     *
     * @return AbstractProductA
     */
    @Override
    public ProductAService createProductA() {
        return new ProductAServiceImpl1();
    }

    /**
     * createProductB
     *
     * @return AbstractProductB
     */
    @Override
    public ProductBService createProductB() {
        return new ProductBServiceImpl1();
    }
}
