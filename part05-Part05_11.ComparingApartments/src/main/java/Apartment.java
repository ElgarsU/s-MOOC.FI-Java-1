
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return (this.squares > compared.squares);
    }
    
    public int priceDifference(Apartment compared) {
        int apartmentPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        int difference = apartmentPrice - comparedPrice;
        return (difference > 0) ? difference : difference * -1;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int apartmentPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;
        return (apartmentPrice > comparedPrice);
    }

}
