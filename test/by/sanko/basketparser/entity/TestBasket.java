package by.sanko.basketparser.entity;

import by.sanko.basketproject.entity.Ball;
import by.sanko.basketproject.entity.Basket;
import by.sanko.basketproject.entity.ColorOfBall;
import by.sanko.basketproject.parser.BallParser;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBasket {
    private Basket basket;


    @BeforeTest
    public void setUp(){
        basket = new Basket(40);
    }

    @Test(priority = 1)
    public void testAddingPositive() {
        boolean actual = basket.addBall(new Ball(20, ColorOfBall.BLUE));
        boolean excepted = true;
        assertEquals(actual,excepted);
    }

    @Test(priority = 2)
    public void testAddingNegative() {
        boolean actual = basket.addBall(new Ball(21, ColorOfBall.BLUE));
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test(priority = 3)
    public void testAddingNull() {
        boolean actual = basket.addBall(null);
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test(priority = 4)
    public void testDeletingNull() {
        boolean actual = basket.removeBall(null);
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test(priority = 5)
    public void testDeletingPositive() {
        boolean actual = basket.removeBall(new Ball(20, ColorOfBall.BLUE));
        boolean excepted = true;
        assertEquals(actual,excepted);
    }

    @Test(priority = 6)
    public void testDeletingNegative() {
        boolean actual = basket.removeBall(new Ball(20, ColorOfBall.BLUE));
        boolean excepted = false;
        assertEquals(actual,excepted);
    }
}
