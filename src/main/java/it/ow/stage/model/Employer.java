package it.ow.stage.model;

/**
 * Created by francesco on 29/04/15.
 */
public class Employer implements Comparable<Employer>{

    private String firstname;
    private String lastname;
    private String address;
    private String telephone;

    public Employer(String firstname, String lastname, String address, String telephone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.telephone = telephone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public int compareTo(Employer other) {
        return this.lastname.equals(other.lastname) ? this.firstname.compareTo(other.firstname): this.lastname.compareTo(other.lastname);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employer employer = (Employer) o;

        if (firstname != null ? !firstname.equals(employer.firstname) : employer.firstname != null) return false;
        if (lastname != null ? !lastname.equals(employer.lastname) : employer.lastname != null) return false;
        if (address != null ? !address.equals(employer.address) : employer.address != null) return false;
        return !(telephone != null ? !telephone.equals(employer.telephone) : employer.telephone != null);

    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        return result;
    }
}
