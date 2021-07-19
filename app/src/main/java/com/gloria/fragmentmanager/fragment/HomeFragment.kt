package com.gloria.fragmentmanager.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.gloria.fragmentmanager.R
import com.gloria.fragmentmanager.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
private lateinit var binding: FragmentHomeBinding
private lateinit var manager: FragmentManager



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        manager = requireActivity().supportFragmentManager
        binding.apply {
            nextbutton.setOnClickListener{

            }
        }
        return binding.root

    }

    private fun openNextFragmentkt(){
        manager.commit{
            replace<NewFragment>(R.id.fragment_container_view)
            setReorderingAllowed(true)
            addToBackStack("")

        }

    }
    private fun openNextFragmentJv(){
        manager.beginTransaction()
            .replace(R.id.fragment_container_view, NewFragment::class.java, null)
            .setReorderingAllowed(true).addToBackStack("")
            .commit()
    }
}
