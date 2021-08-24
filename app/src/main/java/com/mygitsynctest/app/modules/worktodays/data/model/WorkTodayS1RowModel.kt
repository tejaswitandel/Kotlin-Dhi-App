package com.mygitsynctest.app.modules.worktodays.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class WorkTodayS1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtResearchProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_research_produc)

)
