package ni.edu.uca.navleocorea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navleocorea.databinding.FragmentKtoMBinding

class KtoMFragment : Fragment() {
    private lateinit var binding: FragmentKtoMBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentKtoMBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCalcKtoM.setOnClickListener {
            conversion()
        }
    }

    fun conversion(){
        val num = binding.etIngrese.text.toString().toFloat()
        val total = num * 1000
        var msn = ""

        msn = "El total en metos es ${total} m"

        binding.tvResp.setText(msn)
    }
}