package com.mygitsynctest.app.modules.settings.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.settings.`data`.model.SettingsModel

public class SettingsVM : ViewModel() {
  public val settingsModel: MutableLiveData<SettingsModel> = MutableLiveData(SettingsModel())
}
