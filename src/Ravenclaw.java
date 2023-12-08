public class Ravenclaw extends Hogwarts{
    private int hardworking,loyalty, honesty;
    public Ravenclaw(String studentName, int powerMagic, int transgressionDistance,
                     int hardworking, int loyalty, int honesty){
        super(studentName, powerMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.honesty = honesty;
        this.loyalty = loyalty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    @Override
    public String toString() {
        return super.toString() + "; Трудолюбие: " + hardworking + "; Верность: " + honesty +
                "; Честность: " + loyalty;
    }


}

