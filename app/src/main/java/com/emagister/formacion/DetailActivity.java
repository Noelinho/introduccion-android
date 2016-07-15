package com.emagister.formacion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String POSITION = "position";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        int position = intent.getIntExtra(POSITION, 0);

        Food food = Food.FOODs[position];

        ImageView image = (ImageView) findViewById(R.id.food_detail_image);
        image.setImageResource(food.getImageResourceId());

        TextView name = (TextView) findViewById(R.id.food_detail_name);
        name.setText(food.getName());

        TextView desc = (TextView) findViewById(R.id.food_detail_desc);
        desc.setText(food.getDescription());
    }
}
