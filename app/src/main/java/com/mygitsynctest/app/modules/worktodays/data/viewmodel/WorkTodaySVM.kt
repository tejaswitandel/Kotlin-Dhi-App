package com.mygitsynctest.app.modules.worktodays.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.worktodays.`data`.model.WorkTodaySModel

public class WorkTodaySVM : ViewModel() {
  public val workTodaySModel: MutableLiveData<WorkTodaySModel> = MutableLiveData(WorkTodaySModel())
}
