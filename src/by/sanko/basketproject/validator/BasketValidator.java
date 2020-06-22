package by.sanko.basketproject.validator;

import by.sanko.basketproject.entity.Basket;

public class BasketValidator {
    public boolean validate(Basket basket){
        if( basket == null ){
            return false;
        }
        return !(basket.getVolume() < basket.calculateCurrentVolume());
    }
}
