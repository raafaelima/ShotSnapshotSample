package com.soutoss.facebooksnapshotsample

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(buildExpectedItems())

    }

    private fun buildExpectedItems(): List<Pair<Int, String>> = listOf(
        R.drawable.ic_dead to "Deadpool",
        R.drawable.ic_hammer to "Hammer",
        R.drawable.ic_logan to "Logan",
        R.drawable.ic_spider to "Spider",
        R.drawable.ic_some to "Some"
    )

    private fun buildDifferentItemsToFail(): List<Pair<Int, String>> = listOf(
        R.drawable.ic_some to "Some",
        R.drawable.ic_dead to "Deadpool",
        R.drawable.ic_logan to "Logan",
        R.drawable.ic_hammer to "Hammer",
        R.drawable.ic_spider to "Spider"
    )
}