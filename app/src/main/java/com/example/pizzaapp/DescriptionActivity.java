package com.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URI;

public class DescriptionActivity extends AppCompatActivity {


    public static String NOM="NOM";
    public static String DETAISINGRED="DETAISINGRED";
    public static String DESCRIPTION="DESCRIPTION";
    public static String PREPARATION="PREPARATION";
    public static String IMAGE="IMAGE";





    private ImageView imageselected;
    private EditText nomitemselected ;
    private EditText detaisingreditemselected ;
    private EditText descriptionitemselected ;
    private EditText preparationitemselected ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        nomitemselected = findViewById(R.id.nom);
        detaisingreditemselected = findViewById(R.id.detaisingredients);
        descriptionitemselected = findViewById(R.id.description);
        preparationitemselected = findViewById(R.id.preparation);
        imageselected = findViewById(R.id.photo);

        Intent i = getIntent();

        String nameee = i.getStringExtra(NOM);
        String detailsss = i.getStringExtra(DETAISINGRED);
        String descriptionnn = i.getStringExtra(DESCRIPTION);
        String preparationnn = i.getStringExtra(PREPARATION);


        int photoId = i.getIntExtra("IMAGE", R.drawable.time);
        nomitemselected.setText(nameee);
        detaisingreditemselected.setText(detailsss);
        descriptionitemselected.setText(descriptionnn);
        preparationitemselected.setText(preparationnn);
        imageselected.setImageResource(photoId);








    }
}