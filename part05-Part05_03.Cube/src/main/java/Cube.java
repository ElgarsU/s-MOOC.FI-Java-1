
public class Cube {
    
    private int length;
    
    public Cube(int length) {
        this.length = length;
    }
    
    public int volume() {
        int edge = this.length;
        return edge * edge * edge;
    }
    
    public String toString() {
        //int volume = this.volume();
        return "The length of the edge is " +this.length+ " and the volume " +this.volume();
    }
}