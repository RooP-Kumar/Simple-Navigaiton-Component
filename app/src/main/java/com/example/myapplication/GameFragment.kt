package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class GameFragment : Fragment() {
    lateinit var btn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game, container, false)
        btn = view.findViewById<Button>(R.id.runningGame)
        btn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_gameFragment_to_gameOverFragment)
        }
        return view
    }
}