package part5.money;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if(cents >= 100) {
            this.euros = euros + cents / 100;
            this.cents = cents % 100;
        }
        else {
            this.euros = euros;
            this.cents = cents;
        }

    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth

        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if(this.euros < compared.euros) {
            return true;
        }
        else if(this.euros > compared.euros) {
            return false;
        }
        else if(this.cents < compared.cents) {
            return true;
        }
        else {
            return false;
        }
    }

    public Money minus(Money decreaser) {
        Money zeroMoney = new Money(0,0);
        Money newMoney = new Money(this.euros - decreaser.euros, this.cents - decreaser.cents);
        if(newMoney.lessThan(zeroMoney)) {
            return zeroMoney;
        }
        // return the new Money object
        return newMoney;
    }



    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
}

