public class Gryffindor extends Hogwarts {
    private int nobility, honor, bravery;

    public Gryffindor(String studentName, int powerMagic,int transgressionDistance, int nobility, int honor, int bravery) {
        super(studentName, powerMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() + "; Благородство: " + nobility + "; Честь: " + honor +
                "; Храбрость: " + bravery;
    }

    public void comparisonStudents(Gryffindor secondStudent) {
        if(secondStudent != null && (bravery + nobility + honor) >
                (secondStudent.honor + secondStudent.nobility + secondStudent.bravery)){
            System.out.println(getStudentName() + " лучший Гриффиндорец, чем " +
                    secondStudent.getStudentName());
        }
    }
}
