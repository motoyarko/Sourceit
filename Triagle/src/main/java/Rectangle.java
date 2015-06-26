import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by motoyarko on 26-Jun-15.
 */
public class Rectangle implements Triangle{

    public boolean isTriangle(double a, double b, double c) {
        //throw new RuntimeException("Implement");
        if (a < 0 || b < 0 || c <0) {
            return false;
        }
        if ((a + b) > c && (a + c) > b && (b + c) > a){
            return true;
        }
        else {
            return false;
        }
    }
}
