// Rule 05. Object Orientation (OBJ) - OBJ01-J

public class Widget {
    private int total;

    void add() {
        if (total < Integer.MAX_VALUE) {
            total++;
        } else {
            throw new ArithmeticException("Overflow");
        }
    }
    public int getTotal() {
        return total;
    }
}
