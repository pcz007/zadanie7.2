public class School {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Adam", "Kowalski", 48, 1999);
        Teacher teacher2 = new Teacher("Janina", "Nowak", 38, 2010);
        Teacher teacher3 = new Teacher("Zygmunt", "Nowak", 50, 1997);

        Student student1 = new Student("Adaś", "Niezgódka", 7, 1);
        Student student2 = new Student("Tomek", "Noawczyk", 10, 4);
        Student student3 = new Student("Kasia", "Klima", 9, 3);
        Student student4 = new Student("Zuza", "Radkowska", 12, 6);

        System.out.println("Nauczyciele:");
        teacher1.showInfo();
        teacher2.showInfo();
        teacher3.showInfo();
        System.out.println("\nUczniowie:");
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
    }
}
