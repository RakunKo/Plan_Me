package com.example.plan_me.ui.planner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.plan_me.databinding.FragmentPlannerBinding


class PlannerFragment : Fragment() {
    private lateinit var binding: FragmentPlannerBinding
    private var test22 = 1
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlannerBinding.inflate(layoutInflater)
        return binding.root
    }

}