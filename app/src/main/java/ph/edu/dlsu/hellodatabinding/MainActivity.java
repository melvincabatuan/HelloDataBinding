package ph.edu.dlsu.hellodatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import ph.edu.dlsu.hellodatabinding.databinding.ActivityMainBinding;
import ph.edu.dlsu.hellodatabinding.model.Student;

public class MainActivity extends AppCompatActivity {

    private Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        student = new Student("Juan","Tamad", 11112345);
        binding.setStudent(student);
    }

    public void onButtonClick(View view) {
        Toast.makeText(this, "BUTTON CLICKED", Toast.LENGTH_LONG).show();
        student.setLastName("Masipag");
        student.setIdNumber(87654321);

    }
}
