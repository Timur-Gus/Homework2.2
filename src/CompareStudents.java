public class CompareStudents {

    public void compareStudents(Hogwarts firstStudent,Hogwarts secondStudent) {
        if (secondStudent == null || firstStudent == null){
            System.out.println("Ошибка! Одного или обоих студентов не существует!");
        }
        else if((firstStudent.getPowerMagic() + firstStudent.getTransgressionDistance()) >
                (secondStudent.getPowerMagic() + secondStudent.getTransgressionDistance())){
            System.out.println(firstStudent.getStudentName() + " обладает большей мощностью магии, чем " +
                    secondStudent.getStudentName());
        } else  {
            System.out.println(secondStudent.getStudentName() + " обладает большей мощностью магии, чем " +
                    firstStudent.getStudentName());
        }}

    public void compareStudents(Gryffindor firstStudent,Gryffindor secondStudent) {
        if (secondStudent == null || firstStudent == null){
            System.out.println("Ошибка! Одного или обоих студентов не существует!");
        }
        else if((firstStudent.getBravery() + firstStudent.getNobility()
                + firstStudent.getHonor()) >
                (secondStudent.getHonor() + secondStudent.getNobility() + secondStudent.getBravery())){
            System.out.println(firstStudent.getStudentName() + " лучший Гриффиндорец, чем " +
                    secondStudent.getStudentName());
        } else {
            System.out.println(secondStudent.getStudentName() + " лучший Гриффиндорец, чем " +
                    firstStudent.getStudentName());
        }}


    public void compareStudents(Hufflepuff firstStudent,Hufflepuff secondStudent) {
        if (secondStudent == null || firstStudent == null){
            System.out.println("Ошибка! Одного или обоих студентов не существует!");
        }
        else if((firstStudent.getCreation() + firstStudent.getMind()
                + firstStudent.getWisdom() + firstStudent.getWit()) > (secondStudent.getCreation()
                + secondStudent.getMind() + secondStudent.getWisdom() + secondStudent.getWit())){
            System.out.println(firstStudent.getStudentName() + " лучший Пуффендуец, чем " +
                    secondStudent.getStudentName());
        } else {
            System.out.println(secondStudent.getStudentName() + " лучший Пуффендуец, чем " +
                    firstStudent.getStudentName());
        }}
    public void compareStudents(Ravenclaw firstStudent,Ravenclaw secondStudent) {
        if (secondStudent == null || firstStudent == null){
            System.out.println("Ошибка! Одного или обоих студентов не существует!");
        }
        else if((firstStudent.getHardworking() + firstStudent.getHonesty()
                + firstStudent.getLoyalty()) > (secondStudent.getHonesty()
                + secondStudent.getHardworking() + secondStudent.getLoyalty())){
            System.out.println(firstStudent.getStudentName() + " лучший Когтевранец, чем " +
                    secondStudent.getStudentName());
        } else {
            System.out.println(secondStudent.getStudentName() + " лучший Когтевранец, чем " +
                    firstStudent.getStudentName());
        }}
    public void compareStudents(Slytherin firstStudent,Slytherin secondStudent) {
        if (secondStudent == null || firstStudent == null){
            System.out.println("Ошибка! Одного или обоих студентов не существует!");
        }
        else if((firstStudent.getAmbition() + firstStudent.getCunning()
                + firstStudent.getDetermination() + firstStudent.getLustOfPower()
                + firstStudent.getResourcefulness())
                > (secondStudent.getAmbition() + secondStudent.getCunning()
                + secondStudent.getDetermination() + secondStudent.getLustOfPower()
                + secondStudent.getResourcefulness())){
            System.out.println(firstStudent.getStudentName() + " лучший Слизеренц, чем " +
                    secondStudent.getStudentName());
        } else {
            System.out.println(secondStudent.getStudentName() + " лучший Слизеренц, чем " +
                    firstStudent.getStudentName());
        }}

}


