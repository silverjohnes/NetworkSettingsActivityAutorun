package silver.johnes.networksettingsactivityautorun

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.provider.Settings
//import androidx.core.content.ContextCompat.startActivity

class SilentRun : Service() {
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // код, который будет выполняться при старте сервиса
        startActivity(Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))

        // или другие варианты:
        //startActivity( Intent(android.provider.Settings.ACTION_WIFI_SETTINGS))
        //startActivity(Intent(Settings.ACTION_SETTINGS))
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        // код, который будет выполняться при остановке сервиса
    }
}