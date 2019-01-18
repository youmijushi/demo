package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
interface FactoryService {
    /**
     * createProductA
     *
     * @return AbstractProductB
     */
    ProductAService createProductA();

    /**
     * createProductB
     *
     * @return AbstractProductB
     */
    ProductBService createProductB();
}
