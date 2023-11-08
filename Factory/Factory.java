package Factory;

import Circle.Circle;
import Triangle.Triangle;

public abstract class Factory {
    public abstract Circle createCircle(float radius);

    public abstract Triangle createTriangle(float area);
}
