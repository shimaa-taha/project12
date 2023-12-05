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

class chat1Fragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val b_send1: Button = view.findViewById(R.id.b_send1)
        val chat2 = chat2Fragment()
       //recive data from fragment 2
        val data = arguments
        val hello1: String = data?.getString("m2").toString()
        if (hello1 != "null") {
            Toast.makeText(requireContext(), hello1, Toast.LENGTH_LONG).show()
        }
        val e_m_u_1=view.findViewById(R.id.edit_usermessage1)as EditText
        b_send1.setOnClickListener()
        {

            val fragmentTransition: FragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransition.replace(R.id.chat_fragments1,chat2).commit()

             //send data

            val bundle = Bundle()
            bundle.putString("m1",e_m_u_1.text.toString())
            chat2.arguments = bundle

        }


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat1, container, false)
    }

}