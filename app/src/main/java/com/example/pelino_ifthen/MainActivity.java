package com.example.pelino_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView outcome, storybg;
        Button decision1, decision2;

        storybg = findViewById(R.id.storybg);
        outcome = findViewById(R.id.outcome);
        decision1 = findViewById(R.id.decision1);
        decision2 = findViewById(R.id.decision2);

        decision1.setOnClickListener(this);
        decision2.setOnClickListener(this);

        outcome.setText("I see two foods in front of me: a sandwich and a plate of spaghetti. I am running late and I have to leave soon. Which of these foods am I going to eat?");
        storybg.setText("Eating the sandwich takes less time. Eating the spaghetti however, takes too much time.");
    }
    @Override
    public void onClick(View view){

        TextView outcome = findViewById(R.id.outcome);
        TextView storybg = findViewById(R.id.storybg);

        if(view.getId() == R.id.decision1){
            storybg.setText("You get a stomachache on the way to work since the sandwhich is apparently expired. But hey! at least you're not late :')");
        }
        else if(view.getId() == R.id.decision2) {
            storybg.setText("You had a very satisfying breakfast but you got to work 10 minutes late. Well, at least the food was delicious. ");
        }




    }
}