package com.example.sensores

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sensor_luz.*

class SensorLuz : AppCompatActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var mLuz: Sensor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor_luz)

        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        mLuz =sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT)
    }

    override fun onSensorChanged(event: SensorEvent) {
        // The light sensor returns a single value.
        // Many sensors return 3 values, one for each axis.
        val lux = event.values[0]
        tvLux.setText("$lux")
        // Do something with this sensor value.
    }
    override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {
        // Do something here if sensor accuracy changes.
    }
    fun resume(v: View){
        mLuz?.also{light ->
            sensorManager.registerListener(this, light, SensorManager.SENSOR_DELAY_NORMAL)

        }
    }
    fun pause(v:View){
        sensorManager.unregisterListener(this)
    }
}
