// Rule 05. Object Orientation (OBJ) - OBJ01-J

public class Widget {
    public int total;

    void add() {
        if (total < Integer.MAX_VALUE) {
            total++;
        } else {
            throw new ArithmeticException("Overflow");
        }
    }
}
