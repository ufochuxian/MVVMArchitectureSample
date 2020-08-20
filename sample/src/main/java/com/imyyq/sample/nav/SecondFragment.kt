package com.imyyq.sample.nav

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.imyyq.mvvm.base.ViewBindingBaseFragment
import com.imyyq.mvvm.utils.LogUtil
import com.imyyq.sample.R
import com.imyyq.sample.databinding.FragmentSecondBinding

class SecondFragment : ViewBindingBaseFragment<FragmentSecondBinding, StartViewModel>(true) {
    val args: SecondFragmentArgs by navArgs()

    override fun initData() {
        LogUtil.i("SecondFragment", "commonLog - initData: $mViewModel, ${args.userName}")
    }

    override fun initViewObservable() {
        mBinding.btn.setOnClickListener { Navigation.findNavController(it).navigate(R.id.test_no_view_model) }
    }

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentSecondBinding = FragmentSecondBinding.inflate(inflater, container, false)
}