/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.RestIngredients;

import java.util.ArrayList;
import java.util.EnumSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Anton
 */
public enum IngredientsList {
    Chiken(new Meat("Chiken", 6, MeatType.chiken)), Beef(new Meat("Beef", 12, MeatType.beef))
    , Pork(new Meat("Pork", 10, MeatType.pork)), Tomato(new Vegetables("Tomato", 3))
    , Onion(new Vegetables("Onion", 2)), Rukola(new Vegetables("Rukola", 4)), Cheese(new OtherIngredients("cheese", 5));
    private final Ingredients ing;
    private IngredientsList(Ingredients ing)
    {
        this.ing = ing;
    }
    public Ingredients getIng() { return ing; }
    public String getIngName() { return ing.getName(); }
    public double getIngPrice() { return ing.getPrice(); }
    
    public static ArrayList<Ingredients> getMeat() 
    {
        ArrayList<Ingredients> meat = new ArrayList<Ingredients>();
        EnumSet.allOf(IngredientsList.class)
                .forEach(ingredient -> {
                    if(ingredient.getIng() instanceof Meat) { 
                        meat.add(ingredient.getIng()); } 
                });
        return meat;
    }
    public static ArrayList<Ingredients> getVege() 
    {
        ArrayList<Ingredients> vege = new ArrayList<Ingredients>();

        EnumSet.allOf(IngredientsList.class)
                .forEach(ingredient -> {
                    if(ingredient.getIng() instanceof Vegetables) { vege.add(ingredient.getIng()); } 
                });
        return vege;
    }
}
