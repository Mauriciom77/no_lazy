package br.com.mlr.nolazy.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import br.com.mlr.nolazy.R;
import br.com.mlr.nolazy.adapter.AdapterAlarmes;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerAlarmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerAlarmes = findViewById(R.id.recyclerAlarmes);

        //adapter
        AdapterAlarmes adapterAlarmes = new AdapterAlarmes();
        //set LayoutManager do recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerAlarmes.setLayoutManager(layoutManager);
        recyclerAlarmes.setHasFixedSize(true);
        recyclerAlarmes.setAdapter(adapterAlarmes);
    }
}