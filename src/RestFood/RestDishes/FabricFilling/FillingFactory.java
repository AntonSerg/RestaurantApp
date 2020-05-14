/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.FabricFilling;

import RestFood.RestDishes.DishState.*;
import RestFood.RestDishes.RestIngredients.*;
import java.util.ArrayList;

/**
 *
 * @author Anton
 */
public class FillingFactory {
    boolean isMeat = false;
    boolean isVege = false;
    
    public IFilling getFilling(ArrayList<Ingredients> ing)
    {
        for(Ingredients i : ing)
        {
            if(i.getIngType() == ingType.Meat)
            {
                isMeat = true;
            }else if(i.getIngType() == ingType.Vege)
            {
                isVege = true;
            }
        }
        if(isMeat == true && isVege == false) { return new MeatFillingMaker().createFilling(); }
        else if(isVege == true&& isMeat == false) { return new VegeFillingMaker().createFilling(); }
        else { return new MixFillingMaker().createFilling(); }
    }
}
