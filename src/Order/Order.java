/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import Product.Product;
import RestFood.RestDishes.Pizza;
import RestFood.RestDishes.RestIngredients.Ingredients;
import RestFood.RestDishes.RestIngredients.IngredientsList;
import Users.Employee;
import java.util.ArrayList;

/**
 *
 * @author Anton
 */
public class Order {
    ArrayList<Product> prodList;
    double totalPrice;
    String orderDescribe;
    Employee emp;
    public Order(ArrayList<Product> products, Employee emp)
    {
        this.emp = emp;
        this.prodList = products;
        this.totalPrice = calcTotalPrice();
        this.orderDescribe = createOrderDescribe();
    }
    private double calcTotalPrice()
    {
        double total = 0;
        for(Product prod : prodList)
        {
            total += prod.getPrice();
        }
        return total;
    }
    private String createOrderDescribe()
    {
        String OrderDesc = emp.getOrderSign();
        ArrayList<Ingredients> ingOfProd = new ArrayList<Ingredients>();
        ArrayList<Ingredients> ingMeat = IngredientsList.getMeat();
        boolean isVege = true;

        for(Product prod : prodList)
        {
            /*isVege = true;
            if(prod instanceof Pizza)
            {
                ingOfProd = ((Pizza) prod).getIng();
                for(Ingredients ing : ingOfProd)
                {
                    for(Ingredients meatIng : ingMeat)
                    {
                        if(ing.getName().equals(meatIng.getName()))
                        {
                            isVege = false;
                        }
                    }
                }
            }
            if(isVege == true) { 
            OrderDesc += new String(new char[10]).replace('\0', '=');
            OrderDesc += "\n";
            OrderDesc += "Product is vegan";
            }*/
            OrderDesc += new String(new char[10]).replace('\0', '=');
            OrderDesc += "\n";
            OrderDesc += prod.getDescribe();
        }
        OrderDesc += new String(new char[10]).replace('\0', '=');
        OrderDesc += "\nTOTAL PRICE:" + this.getTotalPrice() + "$\n";
        return OrderDesc;
    }

    public ArrayList<Product> getProdList() {
        return prodList;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getOrderDescribe() {
        return orderDescribe;
    }
    
}
