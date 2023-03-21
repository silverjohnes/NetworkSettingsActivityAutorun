class StartOnScreenOn : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent?.action == Intent.ACTION_SCREEN_ON) {
            // Здесь вызывайте вашу программу
        }
    }
}