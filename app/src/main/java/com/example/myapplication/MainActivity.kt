package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var displaytxt:TextView;
    var num=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displaytxt=findViewById(R.id.textView);
        var increasebt=findViewById<Button>(R.id.button2);
        var decreasebt=findViewById<Button>(R.id.button);
        decreasebt.setOnClickListener{
            num--;
            displaytxt.setText(num.toString());
        }
        increasebt.setOnClickListener{
            num++;
            displaytxt.setText(num.toString());
        }
        if(savedInstanceState!=null)
        {
            num=savedInstanceState.getInt("valueN");
            displaytxt.text=num.toString();
        }
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState);
        outState.putInt("valueN",num);
    }
}
