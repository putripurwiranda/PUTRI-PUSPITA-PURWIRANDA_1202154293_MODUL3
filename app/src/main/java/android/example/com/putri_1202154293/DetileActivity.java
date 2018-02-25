package android.example.com.putri_1202154293;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetileActivity extends AppCompatActivity {

    private static final int LEVEL_20 = 0;
    private static final int LEVEL_50 = 1;
    private static final int LEVEL_80 = 2;
    private static final int LEVEL_FULL = 3;
    int mScore1;
    int mScore2;

    TextView tvDeskripsi, tvJudul;
    ImageView ivLogo, ivBaterai;
    Button btMin, btPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detile);

        levelView();
    }

    private void levelView(){
        ivLogo = (ImageView) findViewById(R.id.ivLogo);
        ivBaterai = (ImageView) findViewById(R.id.ivBaterai);
        tvDeskripsi = (TextView) findViewById(R.id.tvDeskripsi);
        tvJudul = (TextView) findViewById(R.id.tvJudul);
        btMin = (Button) findViewById(R.id.btMin);
        btPlus = (Button) findViewById(R.id.btPlus);
    }

    public void kurangi (View view){
        int ViewID = view.getId();
        switch (ViewID){
            case R.id.btMin:
                mScore1--;
                btMin.setText(String.valueOf(mScore1));
        }
    }

    public void tambahi (View view){
        int ViewID = view.getId();
        switch (ViewID) {
            case R.id.btPlus:
                mScore2++;
                btPlus.setText(String.valueOf(mScore2));
        }
    }

}
