package sg.edu.rp.c346.id22024044.lesson_05_demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import sg.edu.rp.c346.id22024044.lesson_05_demodatapassingtest.R;

public class MainActivity extends AppCompatActivity {

    //Event Handling; Step 1
    Button btnPassInteger;

    Button btnPassCharacter;

    TextView tvPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event Handling; Step 2
        btnPassInteger = findViewById(R.id.buttonPassInteger);

        btnPassCharacter = findViewById(R.id.buttonPassChar);

        tvPassDouble = findViewById(R.id.textPassDouble);


        //Event Handling; Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("value", 1);
                startActivity(intent);

            }
        });

        btnPassCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("character", 'a');
                startActivity(intent);

            }
        });

        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnswerActivity.class);
                intent.putExtra("double", 0.00);
                startActivity(intent);

            }
        });

    }
}