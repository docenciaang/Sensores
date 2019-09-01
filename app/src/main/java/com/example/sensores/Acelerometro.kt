//==================================================================
//
//  ejemplo en https://github.com/googlesamples/android-AccelerometerPlay

package com.example.sensores

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_acelerometro.*
import android.os.PowerManager.WakeLock
import android.view.Display
import android.view.WindowManager
import android.os.PowerManager
import android.hardware.SensorManager
import android.view.View


class Acelerometro : AppCompatActivity() {
  //  private val mSimulationView: SimulationView? = null
    private var mSensorManager: SensorManager? = null
    private lateinit var mPowerManager: PowerManager
    private lateinit var mWindowManager: WindowManager
    private var mDisplay: Display? = null
    private var mWakeLock: WakeLock? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acelerometro)
        setSupportActionBar(toolbar)
// Get an instance of the SensorManager
        mSensorManager = getSystemService(SENSOR_SERVICE) as SensorManager;

        // Get an instance of the PowerManager
        mPowerManager =  getSystemService(POWER_SERVICE) as PowerManager;

        // Get an instance of the WindowManager
        mWindowManager =  getSystemService(WINDOW_SERVICE) as WindowManager;
        mDisplay = mWindowManager.getDefaultDisplay();

        // Create a bright wake lock
//        mWakeLock = mPowerManager.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK, getClass()
//            .getName());

        // instantiate our simulation view and set it as the activity's content
//        mSimulationView = new SimulationView(this);
//        mSimulationView.setBackgroundResource(R.drawable.wood);
//        setContentView(mSimulationView);
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }
    fun onParar(v: View){

    }

}
