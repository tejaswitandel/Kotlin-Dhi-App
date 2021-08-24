package com.mygitsynctest.app.modules.personality.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.personality.`data`.model.PersonalityModel

public class PersonalityVM : ViewModel() {
  public val personalityModel: MutableLiveData<PersonalityModel> =
      MutableLiveData(PersonalityModel())
}
