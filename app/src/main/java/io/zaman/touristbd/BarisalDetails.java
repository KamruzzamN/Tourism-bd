package io.zaman.touristbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BarisalDetails extends AppCompatActivity {
    TextView placeTitleDetails,placeContentDetails;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.barisal_details);

        /*defining textView*/
        placeTitleDetails = findViewById(R.id.placeTitleDetails);
        placeContentDetails = findViewById(R.id.placeContentDetails);
        imageView = findViewById(R.id.placeImages);

        int index = getIntent().getExtras().getInt("key");
        String[] placeName = getResources().getStringArray(R.array.barisal_place_name);
        if (index == 0){
            placeTitleDetails.setText(placeName[0]);
            imageView.setImageResource(R.drawable.barisal);
            placeContentDetails.setText(R.string.barisal_all_place);
        }
        else if(index == 1){
            placeTitleDetails.setText(placeName[1]);
            imageView.setImageResource(R.drawable.kukata);
            placeContentDetails.setText(R.string.sagar_konna);
        }
        else if(index == 2){
            placeTitleDetails.setText(placeName[2]);
            imageView.setImageResource(R.drawable.durgasa);
            placeContentDetails.setText(R.string.durga_sagar);
        }
        else if(index == 3){
            placeTitleDetails.setText(placeName[3]);
            imageView.setImageResource(R.drawable.gutaiyamosjig);
            placeContentDetails.setText(R.string.gutiya_mosjic);
        }
        else if(index == 4){
            placeTitleDetails.setText(placeName[4]);
            imageView.setImageResource(R.drawable.meyabarimosjid);
            placeContentDetails.setText(R.string.meia_bari);
        }
        else if(index == 5){
            placeTitleDetails.setText(placeName[5]);
            imageView.setImageResource(R.drawable.shaplagram);
            placeContentDetails.setText(R.string.shapla_gram);
        }
        else if(index == 6){
            placeTitleDetails.setText(placeName[6]);
            imageView.setImageResource(R.drawable.oxfordmission);
            placeContentDetails.setText(R.string.oxford_mission);
        }
    }
}
