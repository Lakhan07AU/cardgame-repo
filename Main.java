// Main.java
public class Main {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();
        Card pickedCard = dealer.pickCard();
        System.out.println("The picked card is: " + pickedCard);
    }
} 