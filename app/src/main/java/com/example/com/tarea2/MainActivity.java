package com.example.com.tarea2;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    /*
    * onConfigurationChanged: If there is a rotation it changes the text
    * */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("TAG_", "onConfigurationChanged");
        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.e("TAG_", "before landscape");
            TextView textView = (TextView) findViewById(R.id.a_answer_txt);
            textView.setText("landscape");
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
            Log.e("TAG_", "" + textView.getText());
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.e("TAG_", "before portrait");
            TextView textView = (TextView) findViewById(R.id.a_answer_txt);
            textView.setText("portrait");
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
            Log.e("TAG_", "" + textView.getText());
        } else {
            Log.e("TAG_", "" + "Else");
        }
    }


}
