package com.imyyq.sample.app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory

/**
 * vm 工厂
 */
object AppViewModelFactory : NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(NetworkViewModel::class.java)) {
//            return NetworkViewModel(BaseApp.getInstance(), Injection.provideDemoRepository()) as T
//        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}