package beans;

import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private List<String> countryOptions;
    private String gender;
    private String[] favLanguages;

    public Student() {
        countryOptions = new ArrayList<String>();
        countryOptions.add("Pakistan");
        countryOptions.add("India");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public void setCountryOptions(List<String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getFavLanguages() {
        return favLanguages;
    }

    public void setFavLanguages(String[] favLanguages) {
        this.favLanguages = favLanguages;
    }
}
