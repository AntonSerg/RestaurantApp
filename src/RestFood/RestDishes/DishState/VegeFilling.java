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
public class VegeFilling implements IFilling{
    String type = "Vege Filling";

    public String getType() {
        return type;
    }
    @Override
    public ArrayList<Ingredients> fillDish(ArrayList<Ingredients> Ingredients) {
        ArrayList<Vegetables> vegeArr = new ArrayList<Vegetables>();
        for(Ingredients vege : Ingredients)
        {
            try{
                if(vege.getIngType() == ingType.Other) { continue; }
                vegeArr.add((Vegetables)vege);
            }catch(ClassCastException e){
                JOptionPane.showMessageDialog(null, e);
                Ingredients.clear();
                break;
            }
        }
        return Ingredients;
    }
    
}
