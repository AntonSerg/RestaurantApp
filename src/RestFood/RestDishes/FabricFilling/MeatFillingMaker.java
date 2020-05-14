/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDishes.FabricFilling;

import RestFood.RestDishes.DishState.*;

/**
 *
 * @author Anton
 */
public class MeatFillingMaker implements IFillingMaker{

    @Override
    public IFilling createFilling() {
        return new MeatFilling();
    }
    
}
