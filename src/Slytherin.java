public class Slytherin extends Hogwarts {
    private int cunning, determination, ambition, resourcefulness, lustOfPower;
    public Slytherin(String studentName, int powerMagic, int transgressionDistance,int cunning,
                     int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(studentName, powerMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }
    @Override
    public String toString() {
        return super.toString() + "; Хитрость: " + cunning + "; Решительность: " + determination +
                "; Амбициозность: " + ambition + "; Жажда власти: " + lustOfPower;
    }

    public void comparisonStudents(Slytherin secondStudent) {
        if(secondStudent != null && (cunning + lustOfPower + determination + ambition) >
                (secondStudent.cunning + secondStudent.lustOfPower + secondStudent.determination +
                        secondStudent.ambition)){
            System.out.println(getStudentName() + " лучший Слизеренец, чем " +
                    secondStudent.getStudentName());
        }
    }
}
