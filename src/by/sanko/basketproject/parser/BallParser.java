package by.sanko.basketproject.parser;

import by.sanko.basketproject.entity.Ball;
import by.sanko.basketproject.entity.ColorOfBall;

import java.util.StringTokenizer;

public class BallParser {

    public Ball parse(String inputData){
        StringTokenizer tokenizer = new StringTokenizer(inputData);
        ColorOfBall colorOfBall = ColorOfBall.valueOf(tokenizer.nextToken());
        double volumeOfBall = Double.parseDouble(tokenizer.nextToken());
        return new Ball(volumeOfBall, colorOfBall);
    }
}
