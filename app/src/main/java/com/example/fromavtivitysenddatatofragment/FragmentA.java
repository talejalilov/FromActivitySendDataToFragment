package com.example.fromavtivitysenddatatofragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    TextView textView;
    Button calculate;
    int number1 =0, number2=0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a,container,false);

        textView = view.findViewById(R.id.textView);
        calculate = view.findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int sum = number1 + number2;
            textView.setText("Your answer " + sum);

            }
        });

        return view ;
    }

    public void sendData(int firstNumber, int secondNumber) {

        this.number1 = firstNumber;
        this.number2= secondNumber;

    }
}
