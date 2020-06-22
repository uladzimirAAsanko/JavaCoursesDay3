package by.sanko.basketproject.entity;

public class Ball {
    private double volume;
    private ColorOfBall color;

    public Ball(double volume, ColorOfBall color) {
        this.volume = volume;
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public ColorOfBall getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.volume, volume) == 0 &&
                color == ball.color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + (int)volume;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(volume).append(" ").append(color);
        return stringBuilder.toString();
    }
}
