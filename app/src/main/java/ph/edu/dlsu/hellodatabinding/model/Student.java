package ph.edu.dlsu.hellodatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by cobalt on 12/28/15.
 */
public class Student extends BaseObservable {
    private String firstName;
    private String lastName;
    private int idNumber;

    public Student(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }


    @Bindable
    public String getFirstName() {
        return this.firstName;
    }


    @Bindable
    public String getLastName() {
        return this.lastName;
    }


    @Bindable
    public int getIdNumber() {
        return this.idNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(ph.edu.dlsu.hellodatabinding.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(ph.edu.dlsu.hellodatabinding.BR.lastName);
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
        notifyPropertyChanged(ph.edu.dlsu.hellodatabinding.BR.idNumber);
    }
}