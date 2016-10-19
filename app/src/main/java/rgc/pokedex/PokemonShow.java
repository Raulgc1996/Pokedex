package rgc.pokedex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Raúl on 15/10/2016.
 */
public class PokemonShow extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.pokemon_show);
        TextView npok = (TextView) findViewById(R.id.textViewnp);
        TextView nompok = (TextView) findViewById(R.id.nomp);
        ImageView photo = (ImageView) findViewById(R.id.imageViewfot);
        TextView type1 = (TextView) findViewById(R.id.textViewt1);
        TextView type2 = (TextView) findViewById(R.id.textViewt2);
        TextView desc = (TextView) findViewById(R.id.textViewdesc);
        int np = (int) getIntent().getExtras().getSerializable("np");
        npok.setText(Integer.toString(np));
        String n = (String) getIntent().getExtras().getSerializable("n");
        nompok.setText(n);
        int i = (int) getIntent().getExtras().getSerializable("i");
        photo.setImageResource(i);
        String t1 = (String) getIntent().getExtras().getSerializable("t1");
        type1.setText(t1);
        String t2 = (String) getIntent().getExtras().getSerializable("t2");
        type2.setText(t2);
        String d = (String) getIntent().getExtras().getSerializable("d");
        desc.setText(d);
    }

}
