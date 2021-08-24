package com.mygitsynctest.app.modules.termsandconditions.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.termsandconditions.`data`.model.TermsandconditionsModel

public class TermsandconditionsVM : ViewModel() {
  public val termsandconditionsModel: MutableLiveData<TermsandconditionsModel> =
      MutableLiveData(TermsandconditionsModel())
}
