package Triangle;

public class Triangle {
    private String colour;
    private float area;
    public Triangle(String colour, float area){
        this.colour = colour;
        this.area = area;
    }
    @Override
    public String toString() {
        return String.format("%s triangle with area %.2f",this.colour, this.area);
    }
}
