package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.practiceset2.R;

public class MainActivity extends AppCompatActivity {
    int udacicolaVotes = 0;
    int pepcityVotes = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void votePepcity(View view) {
        pepcityVotes = pepcityVotes + 1;
        display(pepcityVotes);
        return;
    }

    public void voteUdacicola(View view) {
        udacicolaVotes = udacicolaVotes + 1;
        display1(udacicolaVotes);
        return;
    }

    public void display(int p) {
        TextView t1 = (TextView) findViewById(R.id.display_text_view1);
        t1.setText("" + p);
    }

    public void display1(int c) {
        TextView t2 = (TextView) findViewById(R.id.display_text_view3);
        t2.setText("" + c);
    }
}