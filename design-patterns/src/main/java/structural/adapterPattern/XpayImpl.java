package structural.adapterPattern;

public class XpayImpl implements Xpay {
    private String cardName;
    private Integer cardNumber;

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardName() {
        return this.cardName;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }
}
