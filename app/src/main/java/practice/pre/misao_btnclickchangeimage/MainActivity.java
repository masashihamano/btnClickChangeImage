package practice.pre.misao_btnclickchangeimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        imageView = findViewById( R.id.ivLion );
        button = findViewById( R.id.btnChange );
    }


    public void changeImage(View view)
    {
        if (a%3==0)
        {
            imageView.setImageResource( R.drawable.hippo );
            a++;
        }
        else if(a%3==1) {
            imageView.setImageResource( R.drawable.giraffe );
            a++;
        }
        else {
            imageView.setImageResource( R.drawable.lion );
            a++;
        }
    }
}