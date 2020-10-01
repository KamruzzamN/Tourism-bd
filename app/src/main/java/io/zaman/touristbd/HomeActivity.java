package io.zaman.touristbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HomeActivity extends AppCompatActivity{
    CardView barisal, chittagong, dhaka, khulna, rajshahi, sylhet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*defining cardView*/
        barisal = findViewById(R.id.barisal);
        chittagong = findViewById(R.id.chittagong);
        dhaka = findViewById(R.id.dhaka);
        khulna = findViewById(R.id.khulna);
        rajshahi = findViewById(R.id.rajshahi);
        sylhet = findViewById(R.id.sylhet);

        /*adding onclick listener*/
        barisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBarisal = new Intent(getApplicationContext(),BarisalActivity.class);
                startActivity(intentBarisal);
            }
        });

        chittagong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentChittagong = new Intent(getApplicationContext(),ChittagongActivity.class);
                startActivity(intentChittagong);
            }
        });

        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDhaka = new Intent(getApplicationContext(),DhakaActivity.class);
                startActivity(intentDhaka);
            }
        });

        khulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKhulna = new Intent(getApplicationContext(),KhulnaActivity.class);
                startActivity(intentKhulna);
            }
        });

        rajshahi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRajshahi = new Intent(getApplicationContext(),RajshahiActivity.class);
                startActivity(intentRajshahi);
            }
        });

        sylhet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSylhet = new Intent(getApplicationContext(),SylhetActivity.class);
                startActivity(intentSylhet);
            }
        });
    }
}
