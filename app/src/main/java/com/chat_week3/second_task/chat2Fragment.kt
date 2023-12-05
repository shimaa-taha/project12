package com.chat_week3.second_task

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction

class chat2Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
         val b_send2: Button = view.findViewById(R.id.b_send2)
         val chat1 = chat1Fragment()
         val data = arguments
         val hello2: String = data?.getString("m1").toString()
       if (hello2 != "null")
       {
        Toast.makeText(requireContext(), hello2, Toast.LENGTH_LONG).show()
    }


        b_send2.setOnClickListener() {
        val fragmentTransition: FragmentTransaction = parentFragmentManager.beginTransaction()
        fragmentTransition.replace(R.id.chat2_fragments,chat1).commit()
            val e_m_u_2=view.findViewById(R.id.edit_usermessage2)as EditText
            val bundle = Bundle()
            bundle.putString("m2",e_m_u_2.text.toString())
            chat1.arguments = bundle
    }

}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat2, container, false)
    }

}