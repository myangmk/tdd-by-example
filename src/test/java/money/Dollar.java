package money;

class Dollar {
    private int amount;

    public Dollar(int i) {
        amount = i;
    }

    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object object) {
        return ((Dollar) object).amount == this.amount;
    }
}
