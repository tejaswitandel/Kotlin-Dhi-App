package com.mygitsynctest.app.modules.home.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAdalah: String? = MyApp.getInstance().resources.getString(R.string.lbl_adalah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlcanasatre: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_alcanasatre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJoined6Month: String? =
      MyApp.getInstance().resources.getString(R.string.msg_joined_6_month)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWorkTodayS: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_work_today_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_setting)

)
