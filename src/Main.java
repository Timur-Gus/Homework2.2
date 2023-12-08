public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwartsStudents = new Hogwarts[]{
                new Gryffindor("Гарри Поттер", 94, 85, 76,
                        42, 53),
                new Gryffindor("Гермиона Грейнджер",90,92,87,
                        43, 56),
                new Gryffindor("Рон Уизли",89,57,34,
                        77,88),
                new Ravenclaw("Чжоу Чанг",94,24,52,
                        66,77),
                new Ravenclaw("Падма Патил",32,55,66,
                        96,77),
                new Ravenclaw("Маркус Белби",77,88,65,
                        56,77),
                new Slytherin("Драко Малфой",98, 76, 66,
                        77, 66, 98, 87),
                new Slytherin("Грэхэм Монтегю",42, 44, 98,
                        42, 23, 45, 33),
                new Slytherin("Грегори Гойл",34,37,87,
                        44,56,88,33),
                new Hufflepuff("Захария Смит",42, 33, 45,
                        34, 11, 95),
                new Hufflepuff("Седрик Диггори",78,98,98,
                        44, 44, 47),
                new Hufflepuff("Джастин Финч-Флетчли",55, 79,
                        44, 90, 47, 72)

        };
        System.out.println(hogwartsStudents[1].toString());
        System.out.println(hogwartsStudents[11].toString());
        CompareStudents compare = new CompareStudents();
        compare.compareStudents((Gryffindor) hogwartsStudents[1],(Gryffindor) hogwartsStudents[0]);
        compare.compareStudents(hogwartsStudents[0],hogwartsStudents[1]);
    }

}