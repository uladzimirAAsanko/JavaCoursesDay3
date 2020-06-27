package by.sanko.basketparser.service;

import by.sanko.basketproject.entity.Ball;
import by.sanko.basketproject.entity.Basket;
import by.sanko.basketproject.entity.ColorOfBall;
import by.sanko.basketproject.service.BasketService;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBasketService {
    private BasketService basketService;
    private Basket basket;

    @BeforeTest
    public void setUp(){
        basket = new Basket(40);
        basket.addBall(new Ball(7, ColorOfBall.BLUE));
        basket.addBall(new Ball(10, ColorOfBall.BLUE));
        basket.addBall(new Ball(3, ColorOfBall.RED));
        basket.addBall(new Ball(6, ColorOfBall.RED));
        basket.addBall(new Ball(12, ColorOfBall.BLACK));
        basketService = new BasketService();
    }

    @Test
    public void testCountSmallColorBallsPositive() {
        int actual = 0;
        int excepted = 2;
        actual = basketService.countSameColorBalls(basket, ColorOfBall.BLUE);
        assertEquals(actual,excepted);
    }

    @Test
    public void testCountSmallColorBallsNull() {
        int actual = 0;
        int excepted = 0;
        actual = basketService.countSameColorBalls(null, ColorOfBall.BLUE);
        assertEquals(actual,excepted);
    }
}
