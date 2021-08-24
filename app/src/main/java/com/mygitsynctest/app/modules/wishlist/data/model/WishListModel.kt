package com.mygitsynctest.app.modules.wishlist.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class WishListModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeAWishLis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_a_wish_lis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeAWishLis1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_a_wish_lis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMakeYourJobE: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_your_job_e)

)
