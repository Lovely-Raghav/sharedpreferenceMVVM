package com.lovely.shareredpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.lovely.shareredpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: SimpleViewModel
     private lateinit var factory:SimpleViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding =DataBindingUtil.setContentView(this,R.layout.activity_main)
        factory= SimpleViewModelFactory(this)
        binding.lifecycleOwner=this
        viewModel=ViewModelProvider(this,factory)[SimpleViewModel::class.java]
        binding.submit.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
     viewModel.setFirstName(binding.etFname.text.toString())
        viewModel.setLastName(binding.etLname.text.toString())
    }
}