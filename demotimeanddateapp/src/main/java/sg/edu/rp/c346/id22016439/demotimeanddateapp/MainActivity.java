package sg.edu.rp.c346.id22016439.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

DatePicker dp;
TimePicker tp;
Button btnDisplayDate;
Button btnDisplayTime;
Button btnReset;
TextView tvDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        btnDisplayDate = findViewById(R.id.btnDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.tvDisplay);
        btnReset = findViewById(R.id.btnReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = tp.getCurrentHour();
                int minutes = tp.getCurrentMinute();
                tvDisplay.setText("Time is " + hour + ":" + minutes);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int month = dp.getMonth() + 1;
                int dayMonth = dp.getDayOfMonth();
                int year = dp.getYear();
                tvDisplay.setText("Date is "+dayMonth+"/"+month+"/"+year+"");
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(00);
                tp.setCurrentMinute(00);
                int yr = 2020;
                int date = 1;
                int month = 0;
                dp.updateDate(2020, 1,1);

            }
        });

    }
}