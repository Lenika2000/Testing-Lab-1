package domainModel;

public class Ford {

    private Birthplace birthplace = Birthplace.BETELGEUSE;
    private Bottle bottle;
    // держит ли флакон с рыбкой
    private boolean hasHold = false;

    public void tryTakeBottle() throws IllegalStateException {
        if (!hasHold) {
            takeBottle();
        } else {
            throw new IllegalStateException();
        }
    }

    private void takeBottle() {
        System.out.println("У Форда в руке был стеклянный флакончик, в котором ");
        hasHold = true;
        bottle = new Bottle();
    }

    public void printBirthPlace() {
        System.out.print("и человеком с " + Birthplace.getRussianVersionBirthplaces(birthplace) + "," );
    }

    public Birthplace getBirthplace() {
        return birthplace;
    }

    public void doOffer() throws IllegalStateException{
        if (hasHold) {
            System.out.print(" держащим маленькую рыбку и предлагающим засунуть ее в ухо");
        } else {
            throw new IllegalStateException();
        }
    }

    public void setIsHoldingBottle(boolean hasHold) {
        this.hasHold = hasHold;
    }

}
