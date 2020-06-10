public class Betting {
    private int balance;

    public Betting(int balance) {
        this.balance = balance;
    }

    public void placeBet(int bet) {
        switch (bet) {
            case 5: {
                this.balance = this.balance - 5;
                break;
            }
            case 10: {
                this.balance = this.balance - 10;
                break;
            }
            case 15: {
                this.balance = this.balance - 15;
                break;
            }
            case 20: {
                this.balance = this.balance - 20;
                break;
            }
            case 25: {
                this.balance = this.balance - 25;
                break;
            }
        }
        System.out.println("You have $" + balance + " left");
    }

    public int setWinBalance(int bet) {
        balance = balance + (bet * 2);
        System.out.println("Your balance is $" + balance);
        return balance;
    }

    public int setLoseBalance(int bet) {
        balance = balance - (bet);
        System.out.println("Your balance is $" + balance);
        return balance;
    }
}
