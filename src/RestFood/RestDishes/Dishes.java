/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes;

import Product.Product;

/**
 *
 * @author Anton
 */
public abstract class Dishes extends Product {
    
    public abstract void setName(String name);
    public abstract void setPrice(double price);
    public abstract void setDescribe(String desc);
}
