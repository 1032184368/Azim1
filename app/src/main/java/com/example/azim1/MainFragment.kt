package com.example.azim1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.*

class MainFragment : Fragment(R.layout.fragment_main) {

    @SuppressLint("SimpleDateFormat")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener {
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.fragment_container, SecondFragment.newInstance(getBungle()))
//                .addToBackStack(null)
//                .commit()
            startActivity(Intent(context, SecondTextActivity::class.java).putExtras(getBungle()))
        }

        view.findViewById<Button>(R.id.btn_current_time).setOnClickListener {
            view.findViewById<TextView>(R.id.current_time)?.text =
                SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        }
    }

    private fun getBungle(): Bundle {
        return bundleOf(
            "shared_text" to view?.findViewById<EditText>(R.id.editText)?.text.toString()
        )
    }
}