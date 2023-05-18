package com.example.traceip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String ipAddress = "192.168.0.1"; // Replace with the IP address you want to trace

        IPGeolocationTask task = new IPGeolocationTask(this);
        task.execute(ipAddress);
    }

    @Override
    public void onGeolocationReceived(String countryCode, String countryName, String regionName, String cityName,
                                      double latitude, double longitude) {
        // Handle the received geolocation information
        // Update your UI or perform any desired actions
    }
    @Override
    public void onGeolocationFailed() {
        // Handle geolocation request failure
        // Display an error message or perform any necessary actions
    }
}

