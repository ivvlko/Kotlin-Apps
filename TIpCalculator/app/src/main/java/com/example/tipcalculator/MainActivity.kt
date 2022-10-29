package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateTip.setOnClickListener{ calculateTip() }
    }

    fun calculateTip(){
        val amount : Double = binding.costOfService.text.toString().toDouble();
        val tipType: Int = binding.radioGroup.checkedRadioButtonId;
        val typeToPercentage : HashMap<Int, Double> = HashMap();
        typeToPercentage.put(R.id.radioButton2, 0.20);
        typeToPercentage.put(R.id.radioButton3, 0.18);
        typeToPercentage.put(R.id.radioButton4, 0.15);

        val percentage: Double? = typeToPercentage.get(tipType);
        val round: Boolean = binding.roundupSwitch.isChecked;

        val result : Double = amount * percentage!!;

        if (round){
            binding.amount.setText(result.toInt().toString());
        } else{
            binding.amount.setText(result.toString());
        }

    }
}