package com.mygitsynctest.app.modules.loginsignup.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginSignupModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWorksTodays: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_works_todays)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeToOur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtOurCommunityI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtGetInThrough: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_in_through)

)
