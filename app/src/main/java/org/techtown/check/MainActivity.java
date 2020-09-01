package org.techtown.check;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private SensorManager mSensorManager;
        @SuppressLint("ServiceCast")
        @Override protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            StringBuffer sb = new StringBuffer("");
            mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
                sb.append("Sensor.TYPE_ACCELEROMETER\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) != null)
            { sb.append("Sensor.TYPE_AMBIENT_TEMPERATURE\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY) != null) {
                sb.append("Sensor.TYPE_GRAVITY\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) != null) {
                sb.append("Sensor.TYPE_GYROSCOPE\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) != null) {
                sb.append("Sensor.TYPE_LIGHT\n"); }
            else { } if (mSensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION) != null) {
                sb.append("Sensor.TYPE_LINEAR_ACCELERATION\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) != null) {
                sb.append("Sensor.TYPE_MAGNETIC_FIELD\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION) != null) {
                sb.append("Sensor.TYPE_ORIENTATION\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE) != null) {
                sb.append("Sensor.TYPE_PRESSURE\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) != null) {
                sb.append("Sensor.TYPE_PROXIMITY\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY) != null) {
                sb.append("Sensor.TYPE_RELATIVE_HUMIDITY\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) != null) {
                sb.append("Sensor.TYPE_ROTATION_VECTOR\n"); }
            else { }
            if (mSensorManager.getDefaultSensor(Sensor.TYPE_TEMPERATURE) != null) {
                sb.append("Sensor.TYPE_TEMPERATURE\n"); }
            else { } TextView tv = (TextView)findViewById(R.id.textView);
            tv.setText(sb.toString()); }
}