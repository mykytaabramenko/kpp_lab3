package Circle;

public class Circle {
    private String colour;
    private float radius;
    public Circle(String colour, float radius){
        this.colour = colour;
        this.radius = radius;
    }
    @Override
    public String toString() {
        return String.format("%s circle with radius %.2f",this.colour, this.radius);
    }
}
