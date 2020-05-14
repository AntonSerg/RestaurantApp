package Product;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anton
 */
public abstract class Product {
    protected String name;
    protected double price;
    protected String describe;
    
    public abstract String getName();
    public abstract double getPrice();
    public abstract String getDescribe();
}
