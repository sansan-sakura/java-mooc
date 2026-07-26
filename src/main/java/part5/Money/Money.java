
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;

    }

    public boolean lessThan(Money compared){
        Money comparedMoney = (Money) compared;
        if(comparedMoney.euros > this.euros){
            return true;
        }

        if(comparedMoney.euros == this.euros && comparedMoney.cents > this.cents){
            return true;
        }

        return false;

    }

    public Money minus(Money decreaser){
        int decreasedEuro = this.euros - decreaser.euros;
        int decreasedCents =  this.cents - decreaser.cents;

        int newEuro = decreasedCents > 0 ? decreasedEuro: (decreasedEuro - 1);
        int newCents = decreasedCents > 0 ? decreasedCents : (100 + decreasedCents);


        Money newMoney = new Money(newEuro >= 0? newEuro : 0, newEuro >= 0 ? newCents: 0);

        return newMoney;

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
