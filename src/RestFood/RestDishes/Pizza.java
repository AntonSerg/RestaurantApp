/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes;

import RestFood.RestDishes.DishState.IFilling;
import RestFood.RestDishes.FabricFilling.FillingFactory;
import RestFood.RestDishes.PizzaEnums.*;
import RestFood.RestDishes.RestIngredients.*;
import java.util.ArrayList;

/**
 *
 * @author Anton
 */
public class Pizza extends Dishes{
    private PizzaSize size;
    private PizzaDough dough;
    private PizzaSauce sauce;
    private ArrayList<Ingredients> ingList;
    private int ingCnt;
    private IFilling filling;
    
    public Pizza(String name, double price, String desc, PizzaSize size, PizzaDough dough
            ,PizzaSauce sauce, ArrayList<Ingredients> ing, FillingFactory fillFac){
        super.name = name;
        super.price = price;
        super.describe = desc;
        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        filling = fillFac.getFilling(ing);
        this.ingList = filling.fillDish(ingList);
    }
    public Pizza(String name, PizzaSize size, PizzaDough dough
            ,PizzaSauce sauce, ArrayList<Ingredients> ing, FillingFactory fillFac){
        super.name = name;
        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        this.filling = fillFac.getFilling(ing);
        this.ingList = filling.fillDish(ing);
        this.ingCnt = ingList.size();
        super.price = calcPrice();
        super.describe = createDescription();
    }
    
    public double calcPrice()
    {
        double price = size.getPrice() + dough.getPrice() + sauce.getPrice();
        for(Ingredients ing : ingList)
        {
            price += ing.getPrice();
        }
        return price;
    }
    
    public String createDescription()
    {
        String description = 
                "Pizza Name:\t" + this.getName() + "\n"
                + "Size:\t" + size.getType() + "\t" + size.getPrice() + "$" + "\n"
                + "Dough:\t" + dough.getType() + "\t" + dough.getPrice() + "$" + "\n"
                + "Sauce:\t" + sauce.getType() + "\t" + sauce.getPrice() + "$" + "\n"
                + "Ingredients type(Meat,Vege,Mix):\t"  + filling.getType()  + "\n"
                + "Ingredients count:\t" + ingCnt + "\n";
        String ingList= "";
        for(Ingredients ing : this.ingList)
        {
            ingList += ing.getName() + "\t" + ing.getPrice() + "$" + "\n";
        }
        description += ingList;
        description += "Total Price:\t" + this.getPrice() + "\n";
        return description;
    }
    
    @Override
    public String getName() {
        if(super.name.length() == 0){
            setPrice(0);
            return "Default";
        }else{
            return super.name;
        }
    }

    @Override
    public double getPrice() {
        if(super.name.length() == 0){
            setName("Default");
            return 0;
        }else{
            return super.price;
        }
    }

    @Override
    public String getDescribe() {
        return super.describe;
    }
    
    public PizzaSize getSize() {
        return this.size;
    }

    public PizzaDough getDough() {
        return this.dough;
    }

    public PizzaSauce getSauce() {
        return this.sauce;
    }

    public ArrayList<Ingredients> getIng() {
        return this.ingList;
    }
    
    public void setName(String name) {
        super.name = name;
    }

    public void setPrice(double price) {
        super.price = price;
    }

    public void setDescribe(String desc) {
        super.describe = desc;
    }
    
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setDough(PizzaDough dough) {
        this.dough = dough;
    }

    public void setSauce(PizzaSauce sauce) {
        this.sauce = sauce;
    }

    public boolean addIng(Ingredients ing) {
        return true;
    }

    public boolean removeIng(int index) {
        return true;
    }   

    public boolean removeIng(Ingredients ing) {
        return true;
    }
    
    @Override 
    public String toString()
    {
        return this.getName() + "   " + this.getPrice() + "$";
    }
    
}
