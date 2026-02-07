package Problem1;
public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100);
    }

    public Money (Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherObject){
        long totalCents = this.cents + otherObject.cents;
        long totalDollars = this.dollars + otherObject.dollars + totalCents / 100;
        totalCents = totalCents % 100;
        return new Money(totalDollars + totalCents / 100.0);
    }

    public Money subtract(Money otherObject) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherObject.dollars * 100 + otherObject.cents;
        long diffCents = totalCents1 - totalCents2;
        long resultDollars = diffCents /100;
        long resultCents = diffCents % 100;
        return new Money(resultDollars + resultCents / 100.0);
    }

    public int compareTo(Money otherObject){
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(totalCents1, totalCents2);
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }

    public int compareTO(Money creditLimit) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTO'");
    }

}



