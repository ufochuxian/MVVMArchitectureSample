package com.imyyq.sample.nav

import android.os.Bundle
import android.util.Log
import android.view.View
import com.imyyq.mvvm.base.BaseFragment
import com.imyyq.sample.BR
import com.imyyq.sample.R
import com.imyyq.sample.databinding.FragmentStartBinding

class StartFragment : BaseFragment<FragmentStartBinding, StartViewModel>(
    R.layout.fragment_start, BR.viewModel
) {
    override fun onResume() {
        super.onResume()
        Log.i("StartFragment", "commonLog - onResume: $mBinding, $mViewModel")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i("StartFragment", "commonLog - onViewCreated: $mBinding, $mViewModel")
    }
}