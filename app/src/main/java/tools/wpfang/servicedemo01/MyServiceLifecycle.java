package tools.wpfang.servicedemo01;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyServiceLifecycle extends Service {
    public MyServiceLifecycle() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("SERVICE DATA","Service Created");
        Toast.makeText(this,"Service Created",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service Running",Toast.LENGTH_SHORT).show();
        Log.i("SERVICE DATA","Service Running");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Service Destroyed",Toast.LENGTH_SHORT).show();
        Log.i("SERVICE DATA","Service Destroyed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
