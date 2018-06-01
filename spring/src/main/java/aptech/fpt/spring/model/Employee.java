package aptech.fpt.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameemployee;
    private String address;
    private String dobirth;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameemployee() {
        return nameemployee;
    }

    public void setNameemployee(String nameemployee) {
        this.nameemployee = nameemployee;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDobirth() {
        return dobirth;
    }

    public void setDobirth(String dobirth) {
        this.dobirth = dobirth;
    }
}