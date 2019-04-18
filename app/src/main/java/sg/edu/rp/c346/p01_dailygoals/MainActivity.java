package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = findViewById(R.id.button);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioGroup rg1 = findViewById(R.id.rgroup1);

                int selectedButtonId = rg1.getCheckedRadioButtonId();

                RadioButton rb1 = findViewById(selectedButtonId);

                RadioGroup rg2 = findViewById(R.id.rgroup2);

                int selectedButtonId2 = rg2.getCheckedRadioButtonId();

                RadioButton rb2 = findViewById(selectedButtonId2);

                RadioGroup rg3 = findViewById(R.id.rgroup3);

                int selectedButtonId3 = rg3.getCheckedRadioButtonId();

                RadioButton rb3 = findViewById(selectedButtonId3);

                EditText edtRJ = findViewById(R.id.editText_RJ);

                String[] info ={rb1.getText().toString(),
                        rb2.getText().toString(),
                        rb3.getText().toString(),
                        edtRJ.getText().toString()};

                Intent i = new Intent(MainActivity.this,Summary.class);

                i.putExtra("info", info);

                startActivity(i);
            }
        });
    }
}
