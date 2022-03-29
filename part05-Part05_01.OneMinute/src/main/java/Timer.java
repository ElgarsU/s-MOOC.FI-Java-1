
public class Timer {
    
    private ClockHand hundreaths;
    private ClockHand seconds;
    
    public Timer() {
        this.hundreaths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        this.hundreaths.advance();
        
        if (this.hundreaths.value() == 0) {
            this.seconds.advance();
        }
    }
    
    public String toString() {
        return this.seconds.toString()+ ":" +this.hundreaths.toString();
    }
}