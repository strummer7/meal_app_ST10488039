package vcmsa.ci.meal_app_st10488039

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code starts here
        val editText = findViewById<EditText>(R.id.editTextOne)
        val textView = findViewById<TextView>(R.id.textViewOne)
        val button1 = findViewById<Button>(R.id.buttonSuggest)
        val button2 = findViewById<Button>(R.id.buttonReset)

        //suggest breakfast if breakfast is entered
        // suggest meals when buton1 is pressed
        button1.setOnClickListener {
            if (editText.text.toString().lowercase() == "breakfast") {
                textView.setText("Eggs, Toast, Sausages, Coffee")
                //suggest mid-morning snack if mid-morning snack is entered
            } else if (editText.text.toString().lowercase() == "mid-morning snack") {
                textView.setText("Yoghurt, Berries, Apple")
                //Suggest lunch if lunch is entered
            } else if (editText.text.toString().lowercase() == "lunch") {
                textView.setText("chicken-mayo sandwich, Orange Juice")
                //suggest afternoon snack if afternoon snack is entered
            } else if (editText.text.toString().lowercase() == "afternoon snack") {
                textView.setText("French fries, nuggets")
                //suggest dinner if dinner is entered
            } else if (editText.text.toString().lowercase() == "dinner") {
                textView.setText("Steak, Rice, salad, soda")
                //suggest desert if desert is entered
            } else if (editText.text.toString().lowercase() == "desert") {
                textView.setText("Muffins, Jelly, Custard")
            } else {
                Toast.makeText(this, "please enter correct type of meal", Toast.LENGTH_LONG).show()
            }
            button2.setOnClickListener {
                textView.text = ""
                editText.text.clear()
                // when button is pressed all suggestions will be cleared
            }
        }
    }
}