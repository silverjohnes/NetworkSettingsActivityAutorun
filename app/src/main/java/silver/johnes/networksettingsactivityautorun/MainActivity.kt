package silver.johnes.networksettingsactivityautorun

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Открываем активити Сеть настроек системы
        //startActivity(Intent(Settings.ACTION_SETTINGS))

        // Открываем Internet Conectivity
        startActivity(Intent(android.provider.Settings.Panel.ACTION_INTERNET_CONNECTIVITY))

        // или другие варианты:
        //startActivity( Intent(android.provider.Settings.ACTION_WIFI_SETTINGS))


        // Закрываем текущую активити
        finish()
    }
}