package com.example.fromavtivitysenddatatofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText number1,number2;
    Button passToFragment;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1);
        number2  = findViewById(R.id.number2);
        passToFragment = findViewById(R.id.passToFragment);
        manager=getSupportFragmentManager();

        passToFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA = new FragmentA();

                int firstNumber = Integer.parseInt(number1.getText().toString()) ;
                int secondNumber = Integer.parseInt(number2.getText().toString()) ;

               fragmentA.sendData(firstNumber,secondNumber);

               FragmentTransaction transaction = manager.beginTransaction();
                transaction.add(R.id.frame,fragmentA,"fragA");
                transaction.commit();
            }
        });
    }
}