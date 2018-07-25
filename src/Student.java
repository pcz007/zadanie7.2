public class Student extends People {

    private int currentClass;

    public Student(String firstName, String surname, int age, int currentClass) {
        super(firstName, surname, age);
        setCurrentClass(currentClass);
    }

    public int getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(int currentClass) {
        this.currentClass = currentClass;
    }

    void showInfo() {
        System.out.println(getFirstName() + " " + getSurname() + ", wiek: " + getAge() + ", obecna klasa: " + getCurrentClass());
    }
}
