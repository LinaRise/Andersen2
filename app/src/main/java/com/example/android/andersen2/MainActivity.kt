package com.example.android.andersen2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var mShowCount: TextView
    private val LOG_TAG = MainActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d(LOG_TAG, "Hello World")
        Log.e(LOG_TAG, "Hello World")
        Log.v(LOG_TAG, "Hello World")
        Log.i(LOG_TAG, "Hello World")
        Log.w(LOG_TAG, "Hello World")
        Log.wtf(LOG_TAG, "Hello World")

        mShowCount = findViewById<TextView>(R.id.show_count)

        mShowCount.text = mCount.toString()
    }

    fun showToast(view: View) {
        Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        ).show()
    }

    fun countUp(view: View) {
        ++mCount
        mShowCount.text = mCount.toString()
    }
}