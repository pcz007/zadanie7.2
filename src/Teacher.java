public class Teacher extends People {

    private int startYear;

    public Teacher(String firstName, String surname, int age, int startYear) {
        super(firstName, surname, age);
//        this.setFirstName(firstName);
//        this.setSurname(surname);
//        this.setAge(age);
        setStartYear(startYear);
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    void showInfo() {
        System.out.println(getFirstName() + " " + getSurname() + ", wiek: " + getAge() + ", rozpoczęcie pracy: " +
                getStartYear());
    }
}
