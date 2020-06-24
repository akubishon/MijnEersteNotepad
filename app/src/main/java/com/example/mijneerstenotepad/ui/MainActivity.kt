package com.example.mijneerstenotepad.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mijneerstenotepad.Fragments.NotepadFragment
import com.example.mijneerstenotepad.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, NotepadFragment.newInstance())
                    .commitNow()
        }
    }
}