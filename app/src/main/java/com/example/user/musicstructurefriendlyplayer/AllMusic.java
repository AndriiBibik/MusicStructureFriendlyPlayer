package com.example.user.musicstructurefriendlyplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AllMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_music);

        // setting listener to TextViews

        // finding corresponding TextView (folders_item)
        TextView foldersItem = (TextView) findViewById(R.id.folders_item);
        // setting click listener to the corresponding class
        setListener(foldersItem, MainActivity.class);

        // finding corresponding TextView (now_playing_item)
        TextView nowPlayingItem = (TextView) findViewById(R.id.now_playing_item);
        // setting click listener to the corresponding class
        setListener(nowPlayingItem, NowPlaying.class);

        // finding corresponding TextView (music_store_item)
        TextView musicStoreItem = (TextView) findViewById(R.id.music_store_item);
        // setting click listener to the corresponding class
        setListener(musicStoreItem, MusicStore.class);

        // finding corresponding TextView (meditation_spacebase_item)
        TextView meditationSpacebaseItem = (TextView) findViewById(R.id.meditation_spacebase_item);
        // setting click listener to the corresponding class
        setListener(meditationSpacebaseItem, MeditationSpaceBase.class);

    }

    //setting listener to giver TextView
    private void setListener(TextView textView, final Class classDestination) {
        // setting click listener to the corresponding class
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating a new intent to open corresponding Activity
                Intent intent = new Intent(AllMusic.this, classDestination);
                // starting new activity
                startActivity(intent);
            }
        });
    }
}
