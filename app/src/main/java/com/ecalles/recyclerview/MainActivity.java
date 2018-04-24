package com.ecalles.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;
    ImageButton btn_fav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series = new ArrayList<>();

        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();

        adapter = new SeriesAdapter(series);
        rv.setAdapter(adapter);
    }


    public void prepareSeries(){

        String TAG = "Mensaje";
        series = new ArrayList<>();

        series.add(new Serie("The Walking Dead\n","Seasons: 9\n",R.drawable.twd,"TV show created by Robert Kirman"));
        series.add(new Serie("Game of Thrones","Seasons: 7\n",R.drawable.got,"TV show created by George R. Martin"));
        series.add(new Serie("Breaking Bad","Seasons: 5\n",R.drawable.bbad,"TV show created by Vince Gilligan"));
    }

}
