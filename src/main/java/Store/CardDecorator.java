package Store;

abstract class CardDecorator {
    private Card decorateCard;
    public CardDecorator(Card card){
        this.decorateCard = card;
    }

    public Card getDecorateCard() {
        return decorateCard;
    }
}
