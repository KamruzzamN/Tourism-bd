package io.zaman.touristbd;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DhakaDetails extends AppCompatActivity {
    TextView placeTitleDetails,placeContentDetails;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dhaka_details);

        /*defining textView*/
        placeTitleDetails = findViewById(R.id.placeTitleDetails);
        placeContentDetails = findViewById(R.id.placeContentDetails);
        imageView = findViewById(R.id.placeImages);

        int index = getIntent().getExtras().getInt("key");
        String[] placeName = getResources().getStringArray(R.array.dhaka_place_name);
        if (index == 0){
            placeTitleDetails.setText(placeName[0]);
            imageView.setImageResource(R.drawable.dhaka);
            placeContentDetails.setText(R.string.dhaka_all_place);
        }
        else if(index == 1){
            placeTitleDetails.setText(placeName[1]);
            imageView.setImageResource(R.drawable.taramosjid);
            placeContentDetails.setText(R.string.tara_mosjid);
        }
        else if(index == 2){
            placeTitleDetails.setText(placeName[2]);
            imageView.setImageResource(R.drawable.sakrinutshob);
            placeContentDetails.setText(R.string.sakrin_utshop);
        }
        else if(index == 3){
            placeTitleDetails.setText(placeName[3]);
            imageView.setImageResource(R.drawable.hatirjil);
            placeContentDetails.setText(R.string.hatirjil);
        }
        else if(index == 4){
            placeTitleDetails.setText(placeName[4]);
            imageView.setImageResource(R.drawable.jatiojatoghor);
            placeContentDetails.setText(R.string.jatio_jado_ghor);
        }
        else if(index == 5){
            placeTitleDetails.setText(placeName[5]);
            imageView.setImageResource(R.drawable.jatiosritishoudo);
            placeContentDetails.setText(R.string.jatio_shireshoudo);
        }
        else if(index == 6){
            placeTitleDetails.setText(placeName[6]);
            imageView.setImageResource(R.drawable.ahosanmonjil);
            placeContentDetails.setText(R.string.ahahosan_monjil);
        }
        else if(index == 7){
            placeTitleDetails.setText(placeName[7]);
            imageView.setImageResource(R.drawable.drime);
            placeContentDetails.setText(R.string.drem_holy);
        }
        else if(index == 8){
            placeTitleDetails.setText(placeName[8]);
            imageView.setImageResource(R.drawable.nohaspolli);
            placeContentDetails.setText(R.string.nohaspolly);
        }
        else if(index == 9){
            placeTitleDetails.setText(placeName[9]);
            imageView.setImageResource(R.drawable.diyabari);
            placeContentDetails.setText(R.string.uttara_diya_bari);
        }
    }
}
