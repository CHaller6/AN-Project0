package com.example.android.an_project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * This method displays a toast telling the user that this will launch
     * the Popular Movies App.
     *
     * @param view
     */
    public void launchPopularMovies(View view){
        Toast toast = Toast.makeText(this, "This button will launch the Popular Movies App!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method displays a toast telling the user that
     *
     * @param view
     */
    public void launchStockHawk(View view){
        // Throw a toast here to let the user know that this will launch
        // the Popular Movies App
        Toast toast = Toast.makeText(this, "This button will launch the Stock Hawk App!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method displays a toast telling the user that
     *
     * @param view
     */
    public void launchBuildItBigger(View view){
        // Throw a toast here to let the user know that this will launch
        // the Popular Movies App
        Toast toast = Toast.makeText(this, "This button will launch the Build It Bigger App!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method displays a toast telling the user that
     *
     * @param view
     */
    public void launchMakeYourAppMaterial(View view){
        // Throw a toast here to let the user know that this will launch
        // the Popular Movies App
        Toast toast = Toast.makeText(this, "This button will launch the Make Your App Material App!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method displays a toast telling the user that
     *
     * @param view
     */
    public void launchGoUbiquitous(View view){
        // Throw a toast here to let the user know that this will launch
        // the Popular Movies App
        Toast toast = Toast.makeText(this, "This button will launch the Go Ubiquitous App!",
                Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * This method displays a toast telling the user that
     *
     * @param view
     */
    public void launchCapstone(View view){
        // Throw a toast here to let the user know that this will launch
        // the Popular Movies App
        Toast toast = Toast.makeText(this, "This button will launch the Capstone App!",
                Toast.LENGTH_SHORT);
        toast.show();
    }
}
