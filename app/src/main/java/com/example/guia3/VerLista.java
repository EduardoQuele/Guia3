package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class VerLista extends AppCompatActivity {

    public ListView lstNombres;
    public static List<String> lsNombre = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_lista);

        lstNombres = findViewById(R.id.lstNombres);

        lstNombres.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,lsNombre));
    }
}
