package com.imyyq.sample.nav

import com.imyyq.mvvm.utils.LogUtil
import androidx.navigation.fragment.navArgs
import com.imyyq.mvvm.base.BaseFragment
import com.imyyq.mvvm.base.BaseModel
import com.imyyq.mvvm.base.BaseViewModel
import com.imyyq.sample.R
import com.imyyq.sample.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding, BaseViewModel<BaseModel>>(
    R.layout.fragment_second
) {
    val args: SecondFragmentArgs by navArgs()

    override fun initData() {
        super.initData()
        LogUtil.i("SecondFragment", "commonLog - initData: $mViewModel, ${args.userName}")
    }
}