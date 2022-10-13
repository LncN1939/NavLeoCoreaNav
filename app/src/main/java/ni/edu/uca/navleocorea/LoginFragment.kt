package ni.edu.uca.navleocorea

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import ni.edu.uca.navleocorea.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    val usuario: String = "UCA"
    val pass: String = "Nicaragua"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ni.edu.uca.navleocorea.databinding.FragmentLoginBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnLogin.setOnClickListener {
            val user = binding.etNombre.text.toString()
            val pw = binding.etContra.text.toString()
            ingresar(user,pw)
        }
    }

    private fun ingresar(user: String, pw: String) {
        if(this.usuario.equals(user) and this.pass.equals(pw)){
            findNavController().navigate(R.id.menuFragment)
        }else{
            Toast.makeText(requireActivity(), "Contraseña Incorrecta", Toast.LENGTH_LONG).show()
        }
    }
}