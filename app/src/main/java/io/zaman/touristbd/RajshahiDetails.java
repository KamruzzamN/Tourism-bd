package io.zaman.touristbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RajshahiDetails extends AppCompatActivity {
    TextView placeTitleDetails,placeContentDetails;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rajshahi_details);

        /*defining textView*/
        placeTitleDetails = findViewById(R.id.placeTitleDetails);
        placeContentDetails = findViewById(R.id.placeContentDetails);
        imageView = findViewById(R.id.placeImages);

        int index = getIntent().getExtras().getInt("key");
        String[] placeName = getResources().getStringArray(R.array.rajshahi_place_name);
        if (index == 0){
            placeTitleDetails.setText(placeName[0]);
            imageView.setImageResource(R.drawable.rajshahi);
            placeContentDetails.setText(R.string.rajshahi_all_place);
        }
        else if(index == 1){
            placeTitleDetails.setText(placeName[1]);
            imageView.setImageResource(R.drawable.kamruzzamanddha);
            placeContentDetails.setText(R.string.kamruzzaman_uddhan);
        }
        else if(index == 2){
            placeTitleDetails.setText(placeName[2]);
            imageView.setImageResource(R.drawable.puthiyarajbari);
            placeContentDetails.setText(R.string.putiya_rajbari);
        }
        else if(index == 3){
            placeTitleDetails.setText(placeName[3]);
            imageView.setImageResource(R.drawable.mohastangor);
            placeContentDetails.setText(R.string.mohastan_nogor);
        }
        else if(index == 4){
            placeTitleDetails.setText(placeName[4]);
            imageView.setImageResource(R.drawable.paharpurbodho);
            placeContentDetails.setText(R.string.pahar_pur);
        }
        else if(index == 5){
            placeTitleDetails.setText(placeName[5]);
            imageView.setImageResource(R.drawable.bagamosji);
            placeContentDetails.setText(R.string.baga_bari);
        }
        else if(index == 6){
            placeTitleDetails.setText(placeName[6]);
            imageView.setImageResource(R.drawable.safindpark);
            placeContentDetails.setText(R.string.safani_park);
        }
        else if(index == 7){
            placeTitleDetails.setText(placeName[7]);
            imageView.setImageResource(R.drawable.borandrogobashona);
            placeContentDetails.setText(R.string.borendro_gobasena);
        }
    }
}
