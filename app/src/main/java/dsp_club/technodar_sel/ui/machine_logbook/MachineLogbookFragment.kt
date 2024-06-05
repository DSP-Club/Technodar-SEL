package dsp_club.technodar_sel.ui.machine_logbook

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dsp_club.technodar_sel.AddMainEngine1EventActivity
import dsp_club.technodar_sel.R
import dsp_club.technodar_sel.databinding.FragmentMachineLogbookBinding
import java.util.stream.Collector.Characteristics

class MachineLogbookFragment : Fragment() {

    private var _binding: FragmentMachineLogbookBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val machineLogbookViewModel =
            ViewModelProvider(this).get(MachineLogbookViewModel::class.java)

        _binding = FragmentMachineLogbookBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val buttons: ArrayList<Button> = arrayListOf(
            root.findViewById(R.id.button_machine_boiler_1),
            root.findViewById(R.id.button_machine_disel_generator_1),
            root.findViewById(R.id.button_machine_disel_generator_2),
            root.findViewById(R.id.button_machine_main_engine_2),
            root.findViewById(R.id.button_machine_utp_1),
        )

        for (button in buttons) {
            val code = 0x1F64F
            val emoji = String(Character.toChars(code))
            button.setOnClickListener{
                Toast.makeText(context, "Поставьте троечку, пожалуйста $emoji", Toast.LENGTH_LONG).show()
            }
        }

        val button: Button = root.findViewById(R.id.button_machine_main_engine_1)
        button.setOnClickListener{
            startActivity(Intent(activity, AddMainEngine1EventActivity::class.java))
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}