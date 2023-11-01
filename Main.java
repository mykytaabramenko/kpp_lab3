import Factory.Factory;
import Factory.WhiteFactory;
import Factory.BlackFactory;
import Circle.Circle;
import Triangle.Triangle;

public class Main {
    public static void main(String[] args) {
        // Create a black factory using FactoryCreator and specify the color type.
        Factory blackFactory = FactoryCreator.createFactory(FactoryCreator.colourType.BLACK);
        
        // Create a black circle using the black factory and specify its radius
        Circle blackCircle = blackFactory.createCircle(4.2f);
        
        // Print information about the black circle
        System.out.println(blackCircle);

        // Create a black triangle using the black factory and specify its side length
        Triangle blackTriangle = blackFactory.createTriangle(10.3f);
        
        // Print information about the black triangle
        System.out.println(blackTriangle);

        // Create a white factory using FactoryCreator and specify the color type
        Factory whiteFactory = FactoryCreator.createFactory(FactoryCreator.colourType.WHITE);
        
        // Create a white circle using the white factory and specify its radius
        Circle whiteCircle = whiteFactory.createCircle(4.45f);
        
        // Print information about the white circle
        System.out.println(whiteCircle);

        // Create a white triangle using the white factory and specify its side length
        Triangle whiteTriangle = whiteFactory.createTriangle(8.2f);
        
        // Print information about the white triangle
        System.out.println(whiteTriangle);
    }

    // class for creating factories based on color type
    private static class FactoryCreator {
        public enum colourType {
            WHITE,
            BLACK
        };
        
        public static Factory createFactory(colourType colour) {
            return switch (colour) {
                // Create a WhiteFactory for WHITE color
                case WHITE -> new WhiteFactory();
                // Create a BlackFactory for BLACK color
                case BLACK -> new BlackFactory();
                // Return null for unsupported color types (default case).
                default -> null;
            };
        };
    };
}
