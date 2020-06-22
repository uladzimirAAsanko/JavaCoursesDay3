package by.sanko.basketproject.service;

import by.sanko.basketproject.entity.Ball;
import by.sanko.basketproject.entity.Basket;
import by.sanko.basketproject.entity.ColorOfBall;

import java.util.List;

public class BasketService {

    public int countSameColorBalls(Basket basket, ColorOfBall color) {
        if( basket == null ){
            return 0;
        }

        int counter = 0;
        List<Ball> copyOfBalls = basket.getBalls();
        for(Ball iteration : copyOfBalls){
            if(iteration.getColor() == color){
                counter++;
            }
        }
        return counter;
    }
}
