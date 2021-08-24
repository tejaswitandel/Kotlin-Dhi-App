package com.mygitsynctest.app.modules.signup.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class SignupModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWhenCommunity: String? =
      MyApp.getInstance().resources.getString(R.string.msg_when_community)
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
  public var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etFirstNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etLastNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etEMailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etLoremIpsumDolValue: String? = null
)
