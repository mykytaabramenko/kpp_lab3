package Factory;

import Circle.WhiteCircle;
import Triangle.WhiteTriangle;

public class WhiteFactory extends Factory {
    public WhiteFactory(){};
    @Override
    public WhiteCircle createCircle(float radius) {
        return new WhiteCircle(radius);
    };
    @Override
    public WhiteTriangle createTriangle(float area){
        return new WhiteTriangle(area);
    };
}
