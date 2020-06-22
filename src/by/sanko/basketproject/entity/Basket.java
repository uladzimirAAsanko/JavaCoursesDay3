package by.sanko.basketproject.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final double volume;
    private List<Ball> balls;

    public Basket(double volume) {
        this.volume = volume;
        balls = new ArrayList<>();
    }

    public double getVolume() {
        return volume;
    }

    public List<Ball> getBalls() {
        return new ArrayList<>(balls);
    }

    public boolean addBall(Ball addingBall){
        if(addingBall == null){
            return false;
        }
        double futureVolume = calculateCurrentVolume() + addingBall.getVolume();
        if(futureVolume > volume){
            return false;
        }
        balls.add(addingBall);
        return true;
    }

    public boolean removeBall(Ball removingBalls){
        if(removingBalls == null){
            return false;
        }
        return balls.remove(removingBalls);
    }

    public double calculateCurrentVolume(){
        double currentWeight = 0;
        for(Ball ball : balls){
            currentWeight += ball.getVolume();
        }
        return currentWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket = (Basket) o;
        return volume == basket.volume &&
                balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) volume;
        result = prime * result + (balls == null ? 0 : balls.hashCode());
        return result;
    }
}
