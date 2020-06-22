package by.sanko.basketproject.entity;

public enum ColorOfBall {
    GREEN("green"),
    RED("red"),
    BLACK("black"),
    WHITE("white"),
    BLUE("blue"),
    YELLOW("yellow"),
    ;
    private final String colorName;

    ColorOfBall(String colorName){
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
