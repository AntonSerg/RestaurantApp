/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestFood.RestDrinks.DrinkType;

/**
 *
 * @author Anton
 */
public enum JuiceType {
    orange("Orange"), multi("Multi"), apple("Apple"), grapefruit("Grapefruit");
    
    String type;
    double price;
    
    private JuiceType(String type)
    {
        this.type = type;
        this.price = 5;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}
