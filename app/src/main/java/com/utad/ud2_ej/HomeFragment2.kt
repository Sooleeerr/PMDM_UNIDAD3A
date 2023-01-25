package com.utad.ud2_ej

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home2, container, false)
    }

    val args: HomeFragment2Args by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val argOrigenLogin= args.origenLogin
        val  argEmail=args.email
        val argPassword=args.password
        val argNombre=args.nombre
        val argApellidos=args.apellidos
        val argFechaNac=args.fechaNacimiento

        if (argOrigenLogin){
            view.findViewById<TextView>(R.id.id_text_email).text = argEmail
            view.findViewById<TextView>(R.id.id_text_appelido).visibility =View.INVISIBLE
            view.findViewById<TextView>(R.id.id_text_nombre).visibility =View.INVISIBLE
            view.findViewById<TextView>(R.id.id_text_fechanac).visibility =View.INVISIBLE
            view.findViewById<TextView>(R.id.textView9).visibility =View.INVISIBLE
            view.findViewById<TextView>(R.id.textView11).visibility =View.INVISIBLE
            view.findViewById<TextView>(R.id.textView13).visibility =View.INVISIBLE

        } else {
            view.findViewById<TextView>(R.id.id_text_appelido).visibility =View.VISIBLE
            view.findViewById<TextView>(R.id.id_text_nombre).visibility =View.VISIBLE
            view.findViewById<TextView>(R.id.id_text_fechanac).visibility =View.VISIBLE
            view.findViewById<TextView>(R.id.textView9).visibility =View.VISIBLE
            view.findViewById<TextView>(R.id.textView11).visibility =View.VISIBLE
            view.findViewById<TextView>(R.id.textView13).visibility =View.VISIBLE
            view.findViewById<TextView>(R.id.id_text_email).text = argEmail
            view.findViewById<TextView>(R.id.id_text_appelido).text = argApellidos
            view.findViewById<TextView>(R.id.id_text_nombre).text = argNombre
            view.findViewById<TextView>(R.id.id_text_fechanac).text = argFechaNac

        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

