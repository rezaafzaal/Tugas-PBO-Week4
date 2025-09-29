public class NumberDisplay {
    private int limit;
    private int current;

    public NumberDisplay(int maxLimit) {
        this.limit = maxLimit;
        this.current = 0;
    }

    public int getValue() {
        return current;
    }

    public String getDisplayValue() {
        return (current < 10 ? "0" : "") + current;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue < limit) {
            this.current = newValue;
        }
    }

    public void increment() {
        current = (current + 1) % limit;
    }
}
