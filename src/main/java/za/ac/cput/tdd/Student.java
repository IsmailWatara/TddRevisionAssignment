package za.ac.cput.tdd;

/**
 * @author Monehi Tuoane - 219350744
 */

public class Student {

    //Disabling Test code
    public int addition(int a, int b) {
        return a + b;
    }

    private String name, surname;
    private int studentNum;

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "StudentId{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentNum=" + studentNum +
                '}';
    }

}
