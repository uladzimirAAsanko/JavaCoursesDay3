package by.sanko.basketparser.parser;

import by.sanko.basketproject.entity.Ball;
import by.sanko.basketproject.entity.ColorOfBall;
import by.sanko.basketproject.parser.BallParser;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBasketParser {
    private BallParser ballParser;

    @BeforeTest
    public void setUp(){
        ballParser = new BallParser();
    }

    @Test
    public void testParsePositive() {
        Ball actual = null;
        Ball excepted = new Ball(40 , ColorOfBall.BLUE);
        String input = "BLUE 40";
        actual = ballParser.parse(input);
        assertEquals(actual,excepted);
    }
}
