
public class Money {

    private int euros;
    private int cents;

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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition){
        Money newMoney=new Money(euros, cents);
        if (newMoney.cents+addition.cents > 99) {
            newMoney.euros = newMoney.euros + (newMoney.cents+addition.cents) / 100+addition.euros;
            newMoney.cents = (newMoney.cents+addition.cents) % 100;
        } else {
            newMoney.euros+=addition.euros;
            newMoney.cents+=addition.cents;
        }
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if(this.euros<compared.euros){
            return true;
        } else if(this.cents<compared.cents&&this.euros<=compared.euros){
            return true;
        }
        else return false;
    }

    public Money minus(Money decreaser){
        Money newMoney=new Money(euros, cents);
        if(newMoney.cents<decreaser.cents){
            newMoney.cents=(100+newMoney.cents-decreaser.cents);
            newMoney.euros=newMoney.euros-decreaser.euros-1;
        } else {
            newMoney.euros=newMoney.euros-decreaser.euros;
            newMoney.cents=newMoney.cents-decreaser.cents;
        }
        if(newMoney.euros<0){
            newMoney.cents=0;
            newMoney.euros=0;
        }

        return newMoney;
    }
}
