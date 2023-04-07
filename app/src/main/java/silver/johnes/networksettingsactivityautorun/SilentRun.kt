package silver.johnes.networksettingsactivityautorun

import android.app.Service
import android.content.ComponentName
import android.content.Intent
import android.os.IBinder

class SilentRun : Service() {
    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // код, который будет выполняться при старте сервиса
        //startActivity(Intent(Settings.Panel.ACTION_INTERNET_CONNECTIVITY).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        //startActivity(Intent(Settings.ACTION_WIFI_SETTINGS).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        val intent = Intent()
        intent.component = ComponentName("com.android.settings", "com.android.settings.Settings\$NetworkDashboardActivity")
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        // код, который будет выполняться при остановке сервиса
    }
}