package com.sorrytale.assistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.widget.EditText
import java.lang.Exception

class Settings : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        val prefs = PreferenceManager.getDefaultSharedPreferences(this)
        prefs.edit().putLong("timeout", getDelay(R.id.timeout)).apply()
    }

    private fun getDelay(element: Int): Long {
        var delay: Long = 1000
        try {
            delay = findViewById<EditText>(element).text.toString().toLong()
        } catch (ex: Exception) {
        }
        return delay
    }
}
