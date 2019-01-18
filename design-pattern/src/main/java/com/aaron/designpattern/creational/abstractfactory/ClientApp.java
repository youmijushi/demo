package com.aaron.designpattern.creational.abstractfactory;

/**
 * @author Aaron
 */
public class ClientApp {
    /**
     * main
     *
     */
    public static void main(String[] args) throws Exception {
        FactoryService factory1 = new FactoryServiceImpl1();
        Environment e1 = new Environment(factory1);
        e1.run();

        FactoryService factory2 = new FactoryServiceImpl2();
        Environment e2 = new Environment(factory2);
        e2.run();
    }
}
