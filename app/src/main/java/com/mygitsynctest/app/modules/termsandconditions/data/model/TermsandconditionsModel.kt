package com.mygitsynctest.app.modules.termsandconditions.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class TermsandconditionsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsAndCondi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
