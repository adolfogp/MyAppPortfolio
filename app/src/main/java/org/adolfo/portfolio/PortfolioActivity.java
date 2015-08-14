/*
 * Copyright (C) 2015 Jesús Adolfo García Pasquel
 */
package org.adolfo.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Activity that allows the user to start the apps developed during the
 * <a href="https://www.udacity.com/course/android-developer-nanodegree--nd801">
 * Android Developer Nanodegree</a>.
 *
 * @author Jesús Adolfo García Pasquel
 */
public class PortfolioActivity extends AppCompatActivity {

    public int value;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        setListeners();
    }

    /**
     * Assigns the {@link android.view.View.OnClickListener}s to the Activity's
     * buttons.
     */
    private void setListeners() {
        findViewById(R.id.button_spotify_app).setOnClickListener(
                v -> startSpotifyStreamerApp());

        findViewById(R.id.button_scores_app).setOnClickListener(
                v -> startScoresApp());

        findViewById(R.id.button_library_app).setOnClickListener(
                v -> startLibraryApp());

        findViewById(R.id.button_build_it_app).setOnClickListener(
                v -> startBuildItBiggerApp());

        findViewById(R.id.button_xyz_reader_app).setOnClickListener(
                v -> startXyzReaderApp());

        findViewById(R.id.button_capstone_app).setOnClickListener(
                v -> startCapstoneApp());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Toast.makeText(this, R.string.toast_about_author
                    , Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Starts the Spotify Streamer app.
     */
    public void startSpotifyStreamerApp() {
        // TODO - Start app and remove toast
        Toast.makeText(this, R.string.toast_spotify_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Scores app.
     */
    public void startScoresApp() {
        // TODO - Start app and remove toast
        Toast.makeText(this, R.string.toast_scores_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Library app.
     */
    public void startLibraryApp() {
        // TODO - Start app and remove toast
        Toast.makeText(this, R.string.toast_library_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Build It Bigger app.
     */
    public void startBuildItBiggerApp() {
        // TODO - Start app and remove toast
        Toast.makeText(this, R.string.toast_build_it_bigger_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the XYZ Reader app.
     */
    public void startXyzReaderApp() {
        // TODO - Start app and remove toast
        Toast.makeText(this, R.string.toast_xyz_reader_app
                , Toast.LENGTH_SHORT).show();
    }

    /**
     * Starts the Capstone app.
     */
    public void startCapstoneApp() {
        // TODO - Start app and remove toast
        Toast.makeText(this, R.string.toast_capstone_app
                , Toast.LENGTH_SHORT).show();
    }

}
