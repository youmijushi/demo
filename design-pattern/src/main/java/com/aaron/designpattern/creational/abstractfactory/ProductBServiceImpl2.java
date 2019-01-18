package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class ProductBServiceImpl2 implements ProductBService {
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
