package com.mygitsynctest.app.modules.signup.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.signup.`data`.model.SignupModel

public class SignupVM : ViewModel() {
  public val signupModel: MutableLiveData<SignupModel> = MutableLiveData(SignupModel())
}
