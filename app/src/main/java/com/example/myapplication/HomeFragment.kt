package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {
    lateinit var btn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        btn = view.findViewById<Button>(R.id.startGame)
        btn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_gameFragment)
        }

        return view
    }
}