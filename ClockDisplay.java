public class ClockDisplay {
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String display;

    public ClockDisplay() {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int h, int m) {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(h, m);
    }

    public void timeTick() {
        minutes.increment();
        if (minutes.getValue() == 0) {
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int h, int m) {
        hours.setValue(h);
        minutes.setValue(m);
        updateDisplay();
    }

    public String getTime() {
        return display;
    }

    private void updateDisplay() {
        display = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
