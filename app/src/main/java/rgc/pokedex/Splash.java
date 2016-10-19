package rgc.pokedex;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {
    private final int DURACION_SPLASH = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash);
        giroInicial();
        new Handler().postDelayed(new Runnable(){
            public void run(){

                Intent intent = new Intent(Splash.this,ListOfPokemon.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);
    }
    public void giroInicial(){
        Matrix matrix = new Matrix();
        matrix.postRotate(45.0f);
        Bitmap original = BitmapFactory.decodeResource(getResources(), R.drawable.pokeball);
        Bitmap rotatedBitmap = Bitmap.createBitmap(original, 0, 0, original.getWidth(), original.getHeight(), matrix, true);
        ImageView imgRotate = (ImageView) findViewById(R.id.imageView);
        imgRotate.setImageBitmap(rotatedBitmap);
    }
}
