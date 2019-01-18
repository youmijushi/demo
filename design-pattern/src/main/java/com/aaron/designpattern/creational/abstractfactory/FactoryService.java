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
    ProductAaService createProductA();

    /**
     * createProductB
     *
     * @return AbstractProductB
     */
    ProductBbService createProductB();
}
