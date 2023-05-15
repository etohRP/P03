package sg.edu.rp.c346.id22016439.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEventCode, etEmail;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEventCode = findViewById(R.id.etEventCode);
        etEmail = findViewById(R.id.etEmail);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getCode = etEventCode.getText().toString().trim();
                String getEmail = etEmail.getText().toString().trim();
                etEventCode.setText("");
                etEmail.setText("rp.edu.sg");

                if (getCode.isEmpty() && getEmail.isEmpty()){
                    Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Successful",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}