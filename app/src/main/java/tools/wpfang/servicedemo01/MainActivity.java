package tools.wpfang.servicedemo01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doStartService(View view) {
        Intent it=new Intent(this,MyServiceLifecycle.class);
        startService(it);
    }

    public void doStopService(View view) {
        Intent it=new Intent(this,MyServiceLifecycle.class);
        stopService(it);
    }
}
