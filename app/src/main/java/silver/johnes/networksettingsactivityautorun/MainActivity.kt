package silver.johnes.networksettingsactivityautorun

import android.content.Intent
import android.os.Bundle
//import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        startService(Intent(this, SilentRun::class.java))
        finish()
    }
}