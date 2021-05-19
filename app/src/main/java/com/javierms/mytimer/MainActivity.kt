package com.javierms.mytimer

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    enum class TimerState{
        Stopped, Paused, Running
    }



    private lateinit var timer: CountDownTimer
    private var timerLengthSeconds: Long = 0
    private var timerState = TimerState.Stopped
    private var secondsRemaining: Long = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //start toolbar code
        val toolbar =
            findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        toolbar.setNavigationOnClickListener { finish() }

        //end toolbar code

        

    }

    //start menu code
    override fun onCreateOptionsMenu(miMenu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, miMenu)
        return true
    }

    /*override fun onOptionsItemSelected(opcionmenu: MenuItem): Boolean {
        val id = opcionmenu.itemId
        if (id == R.id.btnMenuMyTeams) {
            val intent = Intent(applicationContext, itemList::class.java)
            startActivity(intent)
        }
        if (id == R.id.btnMenuNewTeam) {
            val intent = Intent(
                applicationContext,
                com.javierms.bloodbowlcoachhelper.createteam::class.java
            )
            startActivity(intent)
        }
        return super.onOptionsItemSelected(opcionmenu)
    }

     */
    //end of menu code


}