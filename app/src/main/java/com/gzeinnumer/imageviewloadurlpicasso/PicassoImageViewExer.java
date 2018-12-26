package com.gzeinnumer.imageviewloadurlpicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoImageViewExer extends AppCompatActivity {

    ImageView imageView,imageView2,imageView3;
    String url = "https://i.ibb.co/2d8qQH4/me.jpg";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exer_picasso_imageview);
        imageView = findViewById(R.id.imageViewTampil);
        imageView2 = findViewById(R.id.imageViewTampil2);
        imageView3 = findViewById(R.id.imageViewTampil3);

        Picasso.with(this)
                .load(url)
                .into(imageView);

        Picasso.with(this)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.drawable.ic_launcher_background)
                .into(imageView2);

        Picasso.with(this)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.drawable.ic_launcher_background)
                .resize(250, 200)
                .rotate(90)
                .into(imageView3);
    }

}
