public class Hufflepuff extends Hogwarts {
    private int creation, mind, wit, wisdom;

    public Hufflepuff(String studentName, int powerMagic, int transgressionDistance, int creation, int mind, int wit, int wisdom) {
        super(studentName, powerMagic, transgressionDistance);
        this.creation = creation;
        this.mind = mind;
        this.wit = wit;
        this.wisdom = wisdom;
    }

    public int getCreation() {
        return creation;
    }

    public int getMind() {
        return mind;
    }

    public int getWit() {
        return wit;
    }

    public int getWisdom() {
        return wisdom;
    }
    @Override
    public String toString() {
        return super.toString() + "; Ум: " + mind + "; Мудрость: " + wisdom +
                "; Остроумие: " + wit + "; Творчество: " + creation;
    }
}
