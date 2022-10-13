package ni.edu.uca.navleocorea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ni.edu.uca.navleocorea.databinding.FragmentCuadradoBinding
import ni.edu.uca.navleocorea.databinding.FragmentElevadoBinding

class CuadradoFragment : Fragment() {
    private lateinit var binding: FragmentCuadradoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCuadradoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCalcCuadrado.setOnClickListener {
            cuadrados()
        }
    }

    fun cuadrados(){
        var num = binding.etCuadrado.text.toString().toDouble()
        var contador = num
        var msn = ""

        while (num >= 1){
            contador -= 1
            msn += "${Math.pow(contador,2.0)}\n"
            num -= 1
        }
        binding.tablaResp.setText(msn)
    }
}