package com.mygitsynctest.app.modules.language.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class LanguageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourSettingsS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_s)

)
