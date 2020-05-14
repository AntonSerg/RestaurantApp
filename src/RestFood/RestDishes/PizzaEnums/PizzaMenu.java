/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.PizzaEnums;

import RestFood.RestDishes.FabricFilling.FillingFactory;
import RestFood.RestDishes.Pizza;
import RestFood.RestDishes.RestIngredients.Ingredients;
import RestFood.RestDishes.RestIngredients.IngredientsList;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anton
 */
public enum PizzaMenu {
    PizzaMeat("Meat Pizza"), PizzaVege("Vege Pizza"), PizzaMix("Mix Pizza"), YourPizza("Your Pizza");
    
    ArrayList<Ingredients> ing;
    String pizzaName;
    IngredientsList ingList;
    private PizzaMenu(String pizzaName)
    {
        this.pizzaName = pizzaName;
        ing = new ArrayList<Ingredients>();
        setIngByName(pizzaName);
    }

    public String getPizzaName() {
        return pizzaName;
    }
    
    public ArrayList<Ingredients> getPizzaIng()
    {
        return ing;
    }
    @Override
    public String toString()
    {
        return pizzaName + " " + ing.size();
    }
    
    private void setIngByName(String pizzaName)
    {
        ing.add(ingList.Cheese.getIng());
        if(pizzaName == "Meat Pizza") { 
            ing.addAll(ingList.getMeat());
        }
        else if(pizzaName == "Vege Pizza") { 
            ing.addAll(ingList.getVege());
        }
        else if(pizzaName == "Mix Pizza") { 
            ing.addAll(ingList.getVege());
            ing.addAll(ingList.getMeat());
        }


    }
}
