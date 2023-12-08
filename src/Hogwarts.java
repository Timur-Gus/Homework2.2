public class Hogwarts {
    private int powerMagic, transgressionDistance;
    private String studentName;

    public Hogwarts(String studentName, int powerMagic, int transgressionDistance) {
        this.powerMagic = powerMagic;
        this.transgressionDistance = transgressionDistance;
        this.studentName = studentName;
    }
    public int getPowerMagic() {
        return powerMagic;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Студент: " + studentName + "; Сила магии: "
                + powerMagic + "; Расстояние трангрессии: " + transgressionDistance;
    }


}
