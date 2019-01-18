package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class ProductBbService2Impl implements ProductBbService {
    /**
     * interact
     *
     * @param abstractProductA
     */
    @Override
    public void interact(ProductAaService abstractProductA) {
        System.out.println(this + " interacts with " + abstractProductA);
    }
}
