package Factory;

import Circle.BlackCircle;
import Triangle.BlackTriangle;

public class BlackFactory extends Factory{
    public BlackFactory(){};
    @Override
    public BlackCircle createCircle(float radius) {
        return new BlackCircle(radius);
    };
    @Override
    public BlackTriangle createTriangle(float area){
        return new BlackTriangle(area);
    };

}
