package io.zaman.touristbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class KhulnaDetails extends AppCompatActivity {
    TextView placeTitleDetails,placeContentDetails;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.khulna_details);

        /*defining textView*/
        placeTitleDetails = findViewById(R.id.placeTitleDetails);
        placeContentDetails = findViewById(R.id.placeContentDetails);
        imageView = findViewById(R.id.placeImages);

        int index = getIntent().getExtras().getInt("key");
        String[] placeName = getResources().getStringArray(R.array.khulna_place_name);

        switch(index){
            case 0:
                placeTitleDetails.setText(placeName[0]);
                imageView.setImageResource(R.drawable.khulna);
                placeContentDetails.setText(R.string.khulna_all_place);
                break;
            case 1:
                placeTitleDetails.setText(placeName[1]);
                imageView.setImageResource(R.drawable.khanjahanali);
                placeContentDetails.setText(R.string.khan_jahan_ali);
                break;
            case 2:
                placeTitleDetails.setText(placeName[2]);
                imageView.setImageResource(R.drawable.robindrokhotibari);
                placeContentDetails.setText(R.string.robindro_thakur_bari);
                break;
            case 3:
                placeTitleDetails.setText(placeName[3]);
                imageView.setImageResource(R.drawable.shatgumbojmosji);
                placeContentDetails.setText(R.string.shat_gumboj_moshjid);
                break;
            case 4:
                placeTitleDetails.setText(placeName[4]);
                imageView.setImageResource(R.drawable.balabhumi);
                placeContentDetails.setText(R.string.bala_bumi);
                break;
            case 5:
                placeTitleDetails.setText(placeName[5]);
                imageView.setImageResource(R.drawable.sundorbon);
                placeContentDetails.setText(R.string.shondur_bon);
                break;
            case 6:
                placeTitleDetails.setText(placeName[6]);
                imageView.setImageResource(R.drawable.robindronathsosurbari);
                placeContentDetails.setText(R.string.robindro_nath_sosur_bari);
                break;
            case 7:
                placeTitleDetails.setText(placeName[7]);
                imageView.setImageResource(R.drawable.monglaport);
                placeContentDetails.setText(R.string.mongla_port);
                break;
            case 8:
                placeTitleDetails.setText(placeName[8]);
                imageView.setImageResource(R.drawable.kotkasoykot);
                placeContentDetails.setText(R.string.kotka_shomudro);
                break;
            case 9:
                placeTitleDetails.setText(placeName[9]);
                imageView.setImageResource(R.drawable.dublarchor);
                placeContentDetails.setText(R.string.dublar_chor);
                break;
        }
    }
}
