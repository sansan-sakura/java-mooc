
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared){
        int price = this.squares * this.princePerSquare;
        int priceCompared = compared.squares * compared.princePerSquare;
        int difference = price - priceCompared;
        return difference < 0? -difference:difference;
    }

    public boolean moreExpensiveThan(Apartment compared){
        int price = this.squares * this.princePerSquare;
        int priceCompared = compared.squares * compared.princePerSquare;
        int difference = price - priceCompared;
        return difference > 0;
    }

}
