package com.example.onboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Fragment onBoarding1, onBoarding2;
    Button btn1, btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        onBoarding1 = new OnBoarding1();
        onBoarding2 = new OnBoarding2();

        //getSupportFragmentManager().beginTransaction().replace(R.id.container, new OnBoarding2()).commit();

       // getSupportFragmentManager().beginTransaction().add(R.id.container, new OnBoarding1()).commit();

        /*FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container,onBoarding1);
        fragmentTransaction.commit();*/

        btn1 = findViewById(R.id.onBoarding1);
        btn2 = findViewById(R.id.onBoarding2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new OnBoarding1()).commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new OnBoarding2()).commit();
            }
        });


    }
}