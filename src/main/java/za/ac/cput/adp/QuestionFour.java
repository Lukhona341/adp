package za.ac.cput.adp;

/** Wajedien Samuels - 216287820
 *
 * This is a verification program
 */

public class QuestionFour {

    private String Firstname, Lastname;
    private int idNumber;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {

        Firstname = firstname;
    }

    public String getLastname() {

        return Lastname;
    }

    public void setLastname(String lastname) {

        Lastname = lastname;
    }

    public int getIdNumber() {

        return idNumber;
    }

    public void setIdNumber(int idNumber) {

        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "QuestionFour{" +
                "Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
