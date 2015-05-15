package android.flag.joaojesus.quemquersermilionario;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private final static String LOG_TAG = "LOG_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.d(LOG_TAG, "onCreate");

        super.onCreate(savedInstanceState);

        /**
         *
         * This line "connects" the layout with this activity.
         *
         */

        setContentView(R.layout.activity_main);

        /**
         *
         * Get the button and set the listener
         *
         * */

        Button btn_MainActivity = (Button) findViewById(R.id.btn_MainActivity);
        btn_MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Execute the async task.
                new GetGameInfo().execute(new WeatherInfo("Lisbon"));
            }
        });
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
}
