package test.minhhoang.uet.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("test", "onCreate Start");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("test", "onCreate Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test", "onResume Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test", "onPause Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test", "onStop Start");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test", "onDestroy Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("test", "onRestart Start");
    }
}
