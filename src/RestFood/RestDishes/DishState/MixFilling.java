/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.DishState;

import RestFood.RestDishes.RestIngredients.Ingredients;
import java.util.ArrayList;

/**
 *
 * @author Anton
 */
public class MixFilling implements IFilling{
    String type = "Mix Filling";
    @Override
    public String getType() {
        return type;
    }
    @Override
    public ArrayList<Ingredients> fillDish(ArrayList<Ingredients> Ingredients) {
        return Ingredients;
    }
    
}
