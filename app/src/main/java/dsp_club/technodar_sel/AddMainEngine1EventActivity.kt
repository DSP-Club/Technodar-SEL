package dsp_club.technodar_sel

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dsp_club.technodar_sel.ui.machine_logbook.MachineLogbookFragment

class AddMainEngine1EventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_main_engine_1_event)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val backButton: Button = findViewById(R.id.button_add_main_engine_1_event_back_to_machine)
        backButton.setOnClickListener{
            startActivity(Intent(this@AddMainEngine1EventActivity, MachineLogbookFragment::class.java))
        }

        val addButton: Button = findViewById(R.id.button_add_main_engine_1_event_add)
        backButton.setOnClickListener{
            startActivity(Intent(this@AddMainEngine1EventActivity, MachineLogbookFragment::class.java))
        }
    }
}