package com.example.kitsuuuu_simple_calculator_javaandroidapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kitsuuuu_simple_calculator_javaandroidapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Add
    public void addHere(View dum){
        TextView tA = findViewById(R.id.txtViewAns);
        EditText num1 = findViewById(R.id.txtNum2);
        EditText num2 = findViewById(R.id.txtNum3);

        //Solve
        int ans = Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString());
        tA.setText("Result Ans : " + ans);
    }
    //Add
    public void minusHere(View dum){
        TextView tA = findViewById(R.id.txtViewAns);
        EditText num1 = findViewById(R.id.txtNum2);
        EditText num2 = findViewById(R.id.txtNum3);

        //Solve
        int ans = Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString());
        tA.setText("Result Ans : " + ans);
    }
    //Add
    public void divideHere(View dum){
        TextView tA = findViewById(R.id.txtViewAns);
        EditText num1 = findViewById(R.id.txtNum2);
        EditText num2 = findViewById(R.id.txtNum3);

        //Solve
        int ans = Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString());
        tA.setText("Result Ans : " + ans);
    }
    //Add
    public void multiplyHere(View dum){
        TextView tA = findViewById(R.id.txtViewAns);
        EditText num1 = findViewById(R.id.txtNum2);
        EditText num2 = findViewById(R.id.txtNum3);

        //Solve
        int ans = Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString());
        tA.setText("Result Ans : " + ans);
    }

}