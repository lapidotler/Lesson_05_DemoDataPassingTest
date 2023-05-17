package sg.edu.rp.c346.id22024044.lesson_05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import sg.edu.rp.c346.id22024044.lesson_05_demodatapassingtest.R;

public class AnswerActivity extends AppCompatActivity {

    //Step 1
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        tvAnswer = findViewById(R.id.textView4);

        Intent intentReceived = getIntent();

        if (intentReceived.hasExtra("value")) {
            //Second Activity
            Intent intendReceivedInt = getIntent();
            int value = intendReceivedInt.getIntExtra("value", 0);
            tvAnswer.setText("Integer value received is: " + value);

        } else if (intentReceived.hasExtra("character")) {
            //Third Activity
            Intent intendReceivedChar = getIntent();
            char character = intendReceivedChar.getCharExtra("character", ' ');
            tvAnswer.setText("Character value received is: " + character);

        } else {
            //Fourth Activity
            Intent intendReceived = getIntent();
            double db = intendReceived.getDoubleExtra("double", 0.00);
            tvAnswer.setText("Double value received is: " + db);

        }

    }

}