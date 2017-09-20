package com.example.android.personas;

import android.content.Intent;
import android.content.res.Resources;
import android.opengl.EGLExt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView LV;
    private Resources resources;
    private String Opc [];
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LV = (ListView)findViewById(R.id.Opciones);
        resources = this.getResources();
        Opc = getResources().getStringArray(R.array.Opciones);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Opc);
        LV.setAdapter(adapter);
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        In =  new Intent(MainActivity.this, CrearPersonas.class);
                        startActivity(In);
                        break;
                    case 1:
                        In =  new Intent(MainActivity.this, ListarPersonas.class);
                        startActivity(In);
                        break;

                }
            }
        });
    }
}
