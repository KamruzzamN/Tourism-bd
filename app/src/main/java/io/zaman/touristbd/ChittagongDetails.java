package io.zaman.touristbd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ChittagongDetails extends AppCompatActivity {
    TextView placeTitleDetails,placeContentDetails;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chittagong_details);

        /*defining textView*/
        placeTitleDetails = findViewById(R.id.placeTitleDetails);
        placeContentDetails = findViewById(R.id.placeContentDetails);
        imageView = findViewById(R.id.placeImages);
        int index = getIntent().getExtras().getInt("key");
        String[] placeName = getResources().getStringArray(R.array.chittagong_place_name);
        switch(index){
            case 0:
                placeTitleDetails.setText(placeName[0]);
                imageView.setImageResource(R.drawable.chittagong);
                placeContentDetails.setText(R.string.all_place_chittagong);
                break;
            case 1:
                placeTitleDetails.setText(placeName[1]);
                imageView.setImageResource(R.drawable.minibd);
                placeContentDetails.setText(R.string.calurgat_mini_bd);
                break;
            case 2:
                placeTitleDetails.setText(placeName[2]);
                imageView.setImageResource(R.drawable.chagolkanda);
                placeContentDetails.setText(R.string.chagol_kanda);
                break;
            case 3:
                placeTitleDetails.setText(placeName[3]);
                imageView.setImageResource(R.drawable.kalamdaha);
                placeContentDetails.setText(R.string.kolomdoho);
                break;
            case 4:
                placeTitleDetails.setText(placeName[4]);
                imageView.setImageResource(R.drawable.batihil);
                placeContentDetails.setText(R.string.batali);
                break;
            case 5:
                placeTitleDetails.setText(placeName[5]);
                imageView.setImageResource(R.drawable.shitakundo);
                placeContentDetails.setText(R.string.shatakundo);
                break;
            case 6:
                placeTitleDetails.setText(placeName[6]);
                imageView.setImageResource(R.drawable.batariylake);
                placeContentDetails.setText(R.string.batarii_lake);
                break;
            case 7:
                placeTitleDetails.setText(placeName[7]);
                imageView.setImageResource(R.drawable.nafkhum);
                placeContentDetails.setText(R.string.nafakhum_jolopropat);
                break;
            case 8:
                placeTitleDetails.setText(placeName[8]);
                imageView.setImageResource(R.drawable.foyajlake);
                placeContentDetails.setText(R.string.fouaj_lake);
                break;
            case 9:
                placeTitleDetails.setText(placeName[9]);
                imageView.setImageResource(R.drawable.enanibitch);
                placeContentDetails.setText(R.string.enani_bitch);
                break;
            case 10:
                placeTitleDetails.setText(placeName[10]);
                placeContentDetails.setText(R.string.himchori);
                break;
            case 11:
                placeTitleDetails.setText(placeName[11]);
                imageView.setImageResource(R.drawable.shondip);
                placeContentDetails.setText(R.string.shondip);
                break;
            case 12:
                placeTitleDetails.setText(placeName[12]);
                imageView.setImageResource(R.drawable.coxbazar);
                placeContentDetails.setText(R.string.coxsbazar_tips);
                break;
        }
    }
}
