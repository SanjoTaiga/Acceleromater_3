import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.Locale;


public class MainActivity extends Activity
        implements SensorEventListener, View.OnClickListener {

    private SensorManager sensorManager;
    private Sensor accel;
    private TextView textView;

    private LineChart mChart;
    private String[] labels = new String[]{
            "linear_accelerationX",
            "linear_accelerationY",
            "linear_accelerationZ"};
    private int[] colors = new int[]{
            Color.BLUE,
            Color.GRAY,
            Color.MAGENTA};

    private boolean lineardata = true;