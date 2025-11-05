package ro.pub.cs.systems.eim.practicaltest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ro.pub.cs.systems.eim.practicaltest.ui.theme.PracticalTESTTheme
import android.widget.Button;
import android.widget.EditText;

class PracticalTest01MainActivity : ComponentActivity() {
    private lateinit var leftEditText : EditText
    private lateinit var rightEditText: EditText
    private lateinit var pressMeButton : Button
    private lateinit var pressMeTooButton : Button

    private var leftNumber = 0
    private var rightNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_main)
        leftEditText = findViewById(R.id.left_edit_text)
        rightEditText = findViewById(R.id.right_edit_text)
        pressMeButton = findViewById(R.id.left_button)
        pressMeTooButton = findViewById(R.id.right_button)
        leftEditText.setText(0)
        rightEditText.setText(0)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticalTESTTheme {
        Greeting("Android")
    }
}