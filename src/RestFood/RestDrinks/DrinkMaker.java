/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDrinks;

import RestFood.RestDrinks.DrinkType.DrinkSize;
import RestFood.RestDrinks.DrinkType.DrinkType;
import RestFood.RestDrinks.DrinkType.*;

/**
 *
 * @author Anton
 */
public class DrinkMaker {
    public static Drinks DrinkCreate(DrinkList DrinkChoosed, Object concreteDrinkType
            , DrinkSize concreteDrinkSize, boolean isCaffeine)
    {
        if(DrinkChoosed.getDrinkType() == DrinkType.coffee)
        {
            Coffee coffee = new Coffee(DrinkChoosed.getName(), DrinkChoosed.getPrice()
            , concreteDrinkSize, isCaffeine);
            return coffee;
        }else if(DrinkChoosed.getDrinkType() == DrinkType.tea)
        {
            Tea tea = new Tea(DrinkChoosed.getName(), DrinkChoosed.getPrice()
                    , (TeaType)concreteDrinkType);
            return tea;
        }else if(DrinkChoosed.getDrinkType() == DrinkType.juice)
        {
            Juice juice = new Juice(DrinkChoosed.getName(), DrinkChoosed.getPrice()
                    ,(JuiceType)concreteDrinkType);
            return juice;
        }
        return null;
    }
}
