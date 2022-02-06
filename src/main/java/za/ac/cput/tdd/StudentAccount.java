/**
 * StudentAccount.java
 * WorkerClass
 * @author Damone Hartnick(219093717)
 * 02 February 2022
 */
package za.ac.cput.tdd;

public class StudentAccount {
    String x;
    int y;

    public StudentAccount() {
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "StudentAccount{" + "x=" + x + ", y=" + y + '}';
    }



}
