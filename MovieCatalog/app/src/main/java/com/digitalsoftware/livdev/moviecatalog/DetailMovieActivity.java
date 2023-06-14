package com.digitalsoftware.livdev.moviecatalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMovieActivity extends AppCompatActivity{

    public static final String EXTRA_MOVIE= "extra_movie";
    TextView tvName, tvGenre, tvRelease, tvDescription, tvRuntime;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_item);

        tvName = findViewById(R.id.tv_name_received);
        tvGenre = findViewById(R.id.tv_genre_received);
        tvRelease = findViewById(R.id.tv_release_received);
        tvDescription = findViewById(R.id.tv_description_received);
        tvRuntime = findViewById(R.id.tv_runtime_received);
        img = findViewById(R.id.img_photo_received);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        Integer photo = movie.getPhoto();
        String name = movie.getName();
        String description = movie.getDescription();
        String genre = movie.getGenre();
        String release = movie.getRelease();
        String runtime = movie.getRuntime();

        img.setImageResource(photo);
        tvRuntime.setText(runtime);
        tvName.setText(name);
        tvGenre.setText(genre);
        tvRelease.setText(release);
        tvDescription.setText(description);

    }
}
