package com.mygitsynctest.app.modules.language.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.language.`data`.model.LanguageModel

public class LanguageVM : ViewModel() {
  public val languageModel: MutableLiveData<LanguageModel> = MutableLiveData(LanguageModel())
}
