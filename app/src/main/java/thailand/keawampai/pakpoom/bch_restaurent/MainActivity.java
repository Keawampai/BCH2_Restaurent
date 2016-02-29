package thailand.keawampai.pakpoom.bch_restaurent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private Mymage mymage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Request Database
        mymage = new Mymage(this);

    }//Main Method
}// Main Class
