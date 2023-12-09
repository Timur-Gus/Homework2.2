public class CompareStudents {

    public void compareStudents(Hogwarts firstStudent,Hogwarts secondStudent) {
        if (secondStudent == null || firstStudent == null){
            System.out.println("Ошибка! Одного или обоих студентов не существует!");
        }
        else if(firstStudent.sumSkills() > secondStudent.sumSkills()){
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
        else if(firstStudent.sumSkills() > secondStudent.sumSkills()){
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
        else if(firstStudent.sumSkills() > secondStudent.sumSkills()){
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
        else if(firstStudent.sumSkills() > secondStudent.sumSkills()){
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
        else if(firstStudent.sumSkills() > secondStudent.sumSkills()){
            System.out.println(firstStudent.getStudentName() + " лучший Слизеренц, чем " +
                    secondStudent.getStudentName());
        } else {
            System.out.println(secondStudent.getStudentName() + " лучший Слизеренц, чем " +
                    firstStudent.getStudentName());
        }}

}


