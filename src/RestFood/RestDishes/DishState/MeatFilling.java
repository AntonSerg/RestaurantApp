/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.DishState;

import RestFood.RestDishes.RestIngredients.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anton
 */
public class MeatFilling implements IFilling{
    String type = "Meat Filling";
    @Override
    public String getType() {
        return type;
    }
    @Override
    public ArrayList<Ingredients> fillDish(ArrayList<Ingredients> Ingredients) {
        ArrayList<Meat> meatArr = new ArrayList<Meat>();
        for(Ingredients meat : Ingredients)
        {
            try{
                if(meat.getIngType() == ingType.Other) { continue; }
                meatArr.add((Meat)meat);
            }catch(ClassCastException e){
                JOptionPane.showMessageDialog(null, e);
                Ingredients.clear();
                break;
            }
        }
        return Ingredients;
    }
}
    
