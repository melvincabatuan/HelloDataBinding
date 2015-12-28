package ph.edu.dlsu.hellodatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by cobalt on 12/28/15.
 */
public class Student extends BaseObservable {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Bindable
    public String getFirstName() {
        return this.firstName;
    }


    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(ph.edu.dlsu.hellodatabinding.BR.firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(ph.edu.dlsu.hellodatabinding.BR.lastName);
    }
}