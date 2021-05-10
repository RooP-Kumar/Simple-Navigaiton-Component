package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavOptions
import androidx.navigation.Navigation

class GameOverFragment : Fragment() {
    lateinit var btn: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_game_over, container, false)
        btn = view.findViewById<Button>(R.id.gameOver)
        btn.setOnClickListener {
            val navOptions = NavOptions.Builder().setPopUpTo(R.id.homeFragment, true).build()
            Navigation.findNavController(view).navigate(R.id.action_gameOverFragment_to_homeFragment, null, navOptions)
        }

        return view
    }

}