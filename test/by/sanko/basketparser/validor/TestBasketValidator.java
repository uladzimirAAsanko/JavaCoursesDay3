package by.sanko.basketparser.validor;

import by.sanko.basketproject.entity.Basket;
import by.sanko.basketproject.parser.BallParser;
import by.sanko.basketproject.validator.BasketValidator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBasketValidator {
    private BasketValidator basketValidator;

    @BeforeTest
    public void setUp(){
        basketValidator = new BasketValidator();
    }

    @Test
    public void testParsePositive() {
        boolean actual = basketValidator.validate(new Basket(40));
        boolean excepted = true;
        assertEquals(actual,excepted);
    }

    @Test
    public void testParseNegative() {
        boolean actual = basketValidator.validate(null);
        boolean excepted = false;
        assertEquals(actual,excepted);
    }

    @Test
    public void testParseNegativeOne() {
        boolean actual = basketValidator.validate(new Basket(-1));
        boolean excepted = false;
        assertEquals(actual,excepted);
    }


}
