package io.zaman.touristbd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SylhetDetails extends AppCompatActivity {
    TextView placeTitleDetails,placeContentDetails;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sylhet_details);

        /*defining textView*/
        placeTitleDetails = findViewById(R.id.placeTitleDetails);
        placeContentDetails = findViewById(R.id.placeContentDetails);
        imageView = findViewById(R.id.placeImages);

        int index = getIntent().getExtras().getInt("key");
        String[] placeName = getResources().getStringArray(R.array.sylhet_place_name);

        if (index == 0){
            placeTitleDetails.setText(placeName[0]);
            imageView.setImageResource(R.drawable.sylhet);
            placeContentDetails.setText(R.string.all_sylhet_place);
        }
        else if(index == 1){
            placeTitleDetails.setText(placeName[1]);
            imageView.setImageResource(R.drawable.sahajalal);
            placeContentDetails.setText(R.string.sahajalal_content);
        }
        else if(index == 2){
            placeTitleDetails.setText(placeName[2]);
            imageView.setImageResource(R.drawable.jaflong);
            placeContentDetails.setText(R.string.jaflong_content);
        }
        else if(index == 3){
            placeTitleDetails.setText(placeName[3]);
            imageView.setImageResource(R.drawable.punothamai);
            placeContentDetails.setText(R.string.panuthamai_content);
        }
        else if(index == 4){
            placeTitleDetails.setText(placeName[4]);
            imageView.setImageResource(R.drawable.bichanakandi);
            placeContentDetails.setText(R.string.bichanakandi_content);
        }
        else if(index == 5){
            placeTitleDetails.setText(placeName[5]);
            imageView.setImageResource(R.drawable.uthmachara);
            placeContentDetails.setText(R.string.vujlajela_content);
        }
        else if(index == 6){
            placeTitleDetails.setText(placeName[6]);
            imageView.setImageResource(R.drawable.bulagongo);
            placeContentDetails.setText(R.string.uthmachara_content);
        }
        else if(index == 7){
            placeTitleDetails.setText(placeName[7]);
            imageView.setImageResource(R.drawable.milinechabagan);
            placeContentDetails.setText(R.string.chabagan_content);
        }else if(index == 8){
            placeTitleDetails.setText(placeName[8]);
            imageView.setImageResource(R.drawable.sahaporan);
            placeContentDetails.setText(R.string.sahaporan_content);
        }
        else if(index == 9){
            placeTitleDetails.setText(placeName[9]);
            imageView.setImageResource(R.drawable.hamham);
            placeContentDetails.setText(R.string.hamhamjorna_content);
        }
    }
}
