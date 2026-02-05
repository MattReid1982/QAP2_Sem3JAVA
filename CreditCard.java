public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0.0);
    }

    public Money getBalance(){
        return new Money(this.balance);
    }

    public Money getCreditLimit(){
        return new Money(this.creditLimit);
    }

    public String getPersonals(){
        return this.owner.toString();
    }

    public void charge(Money amount){
        Money newBalance = this.balance.add(amount);
        if (newBalance.compareTO(this.creditLimit) <= 0){
            this.balance = newBalance;
        } else {
            System.out.println("Charge denied: exceeds credit limit.");
        }
    }

    public void payment(Money amount){
        this.balance = this.balance.subtract(amount);
    }

    
}

