package dsp_club.technodar_sel.ui.ships_logbook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dsp_club.technodar_sel.R
import dsp_club.technodar_sel.databinding.FragmentShipsLogbookBinding

class ShipsLogbookFragment : Fragment() {

    private var _binding: FragmentShipsLogbookBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val shipsLogbookViewModel =
            ViewModelProvider(this).get(ShipsLogbookViewModel::class.java)

        _binding = FragmentShipsLogbookBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val buttons: ArrayList<Button> = arrayListOf(
            root.findViewById(R.id.button_ships_events),
            root.findViewById(R.id.button_ships_add_event),
            root.findViewById(R.id.button_ships_hydrometeorological_data),
            root.findViewById(R.id.button_ships_solas_74),
            root.findViewById(R.id.button_ships_course_and_position)
        )

        for (button in buttons) {
            val code = 0x1F64F
            val emoji = String(Character.toChars(code))
            button.setOnClickListener{
                Toast.makeText(context, "Поставьте троечку, пожалуйста $emoji", Toast.LENGTH_LONG).show()
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}