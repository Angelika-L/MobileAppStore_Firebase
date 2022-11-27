package com.example.firebaseshopp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    EditText editTextName, editTextPrice;
    Button buttonSave;

    private FirebaseDatabase databaseFA;
    private DatabaseReference ref, ref_num, people_dr, string_dr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ref = FirebaseDatabase.getInstance().getReference("zakupy");

        editTextName = findViewById(R.id.editTextName);
        editTextPrice = findViewById(R.id.editTextPrice);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addProduuct();
            }
        });

    }

    private void addProduuct (){
        String name = editTextName.getText().toString().trim();
        String price = editTextPrice.getText().toString().trim();

        if(!TextUtils.isEmpty(name)){
            String id =  ref.push().getKey();
            productList productList = new productList(id,name,price);
            ref.setValue(productList);
            Toast.makeText(this,"Produkt dodany",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Nie podano nazwy produktu",Toast.LENGTH_LONG).show();
        }
    }


}

