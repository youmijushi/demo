package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class ProductBServiceImpl1 implements ProductBService {
    /**
     * interact
     *
     * @param abstractProductA
     */
    @Override
    public void interact(ProductAService abstractProductA) {
        System.out.println(this + " interacts with " + abstractProductA);
    }
}
