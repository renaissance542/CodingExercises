public class AreaCalculator {
//    private static final String INVALID_ERROR_MESSAGE = "Invalid Input";
    public static double area(double radius){
        if (radius < 0){
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double length, double height){
        if (length < 0 || height < 0){
            return -1;
        } else {
            return length * height;
        }
    }
}
