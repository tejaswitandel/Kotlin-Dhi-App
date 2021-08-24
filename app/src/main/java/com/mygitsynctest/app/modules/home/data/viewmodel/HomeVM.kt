package com.mygitsynctest.app.modules.home.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.home.`data`.model.HomeModel

public class HomeVM : ViewModel() {
  public val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())
}
