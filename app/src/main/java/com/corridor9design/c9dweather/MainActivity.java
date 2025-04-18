package com.corridor9design.c9dweather;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.corridor9design.c9dweather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
	
	  private ActivityMainBinding binding;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		    binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
		    setSupportActionBar(binding.toolbar);

		    binding.fab.setOnClickListener(v ->
            Toast.makeText(MainActivity.this, "Replace with your action", Toast.LENGTH_SHORT).show()
            );
            binding.fab.hide();

            ((TextView)findViewById(R.id.txt_initialTextView)).setText("Hello Andoid!");
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}