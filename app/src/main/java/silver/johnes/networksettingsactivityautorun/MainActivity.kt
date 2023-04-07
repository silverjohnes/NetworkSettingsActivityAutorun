package silver.johnes.networksettingsactivityautorun

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import android.content.Context

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //// Закрытие окна настроек если открыто
        setContentView(R.layout.activity_main)

        // Получаем контекст приложения
        val context: Context = applicationContext

        // Проверяем, запущено ли стандартное приложение Settings
        val settingsIntent = Intent(Settings.ACTION_SETTINGS)
        val isSettingsOpen = context.packageManager.queryIntentActivities(settingsIntent, 0).isNotEmpty()

        // Если приложение Settings запущено, закрываем его
        if (isSettingsOpen) {
            finish()
        }


        startService(Intent(this, SilentRun::class.java))
        finish()
    }
}