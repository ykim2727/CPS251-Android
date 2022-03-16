 package com.example.lifecycleaware.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycleaware.databinding.MainFragmentBinding
import com.example.lifecycleaware.DemoObserver

 class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }
    private lateinit var viewModel: MainViewModel
    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

     override fun onResume() {
         super.onResume()
         binding.output.text = viewModel.resume()
         binding.output.text = viewModel.lifeCycleEnd()
     }

     override fun onDestroy() {
         super.onDestroy()
         binding.output.text = viewModel.destroy()
         binding.output.text = viewModel.lifeCycleEnd()
     }

     override fun onPause() {
         super.onPause()
         binding.output.text = viewModel.pause()
         binding.output.text = viewModel.lifeCycleEnd()
     }

     override fun onStart() {
         super.onStart()
         binding.output.text = viewModel.start()
     }

     override fun onStop() {
         super.onStop()
         binding.output.text = viewModel.stop()
     }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        lifecycle.addObserver(DemoObserver())
        binding.output.text = viewModel.activityCreated()

    }

}