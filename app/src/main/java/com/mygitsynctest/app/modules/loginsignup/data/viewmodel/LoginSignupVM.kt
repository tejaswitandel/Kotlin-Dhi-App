package com.mygitsynctest.app.modules.loginsignup.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.loginsignup.`data`.model.LoginSignupModel

public class LoginSignupVM : ViewModel() {
  public val loginSignupModel: MutableLiveData<LoginSignupModel> =
      MutableLiveData(LoginSignupModel())
}
