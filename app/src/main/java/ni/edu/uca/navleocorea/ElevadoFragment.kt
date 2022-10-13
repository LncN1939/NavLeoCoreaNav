package ni.edu.uca.navleocorea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navleocorea.databinding.FragmentElevadoBinding
import ni.edu.uca.navleocorea.databinding.FragmentKtoMBinding

class ElevadoFragment : Fragment() {
    private lateinit var binding: FragmentElevadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentElevadoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCalcElevado.setOnClickListener {
            raiz()
        }
    }

    fun raiz(){
        val num = binding.etNum.text.toString().toDouble()
        val total = Math.sqrt(num)
        var msn = ""

        msn = "La raiz es ${total}"

        binding.tvRespElevado.setText(msn)
    }
}