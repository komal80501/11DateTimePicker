package com.example.hp.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

//    TimePicker timePicker;
    TextView textView;
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //timePicker =findViewById(R.id.timePicker);
        textView = findViewById(R.id.textView);
        datePicker=findViewById(R.id.datePicker);

        final Calendar calendar = Calendar.getInstance();

        datePicker.init(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH),

                new DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year, int month, int day) {
                      int mnth = month+1;
                        textView.setText("You Selected :" +day +"/"+mnth+"/"+year);
                    }
                }
        );


//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hour, int minute) {
//                textView.setText("Hour: "+hour +"\nMinutes: "+minute);
//            }
//        });
    }
}
