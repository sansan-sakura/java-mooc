
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money= 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros

        double rest = payment - 2.5;
        if(rest < 0){
            return payment;
        }

        this.affordableMeals ++;
        this.money = this.money + 2.5;
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return rest;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        double rest = payment - 4.3;
        if(rest < 0){
            return payment;
        }

        this.heartyMeals ++;
        this.money = this.money + 4.3;
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return rest;
    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros

        double rest = card.balance() - 2.5;
        if(rest < 0){
            return false;
        }

        this.affordableMeals ++;

        card.takeMoney(2.5);
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        double rest = card.balance() - 4.3;
        if(rest < 0){
            return false;
        }

        this.heartyMeals ++;

        card.takeMoney(4.3);
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        return true;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum < 0){
            return;
        }
        card.addMoney(sum);
        money = money + sum;

    }



    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
