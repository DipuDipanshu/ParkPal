package newapp.com.example.dipanshugupta.parkpal;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        button = (Button) findViewById(R.id.button);



    }



    public void OnDone(View view) {
        //String type = "Done";
        //BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        //backgroundWorker.execute(type);
        Intent Intent = new Intent("newapp.com.example.dipanshugupta.parkpal.second");
        startActivity(Intent);


    }


}
