package io.zaman.touristbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ChittagongActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chittagong_activity);
        listView = findViewById(R.id.chittagongListView);
        String[] placeName = getResources().getStringArray(R.array.chittagong_place_name);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.list_view,R.id.textView,placeName);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent placeDetails = new Intent(getApplicationContext(),ChittagongDetails.class);
                placeDetails.putExtra("key",position);
                startActivity(placeDetails);
            }
        });
    }
}
