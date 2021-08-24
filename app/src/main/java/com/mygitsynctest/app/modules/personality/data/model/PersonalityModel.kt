package com.mygitsynctest.app.modules.personality.`data`.model

import com.mygitsynctest.app.R
import com.mygitsynctest.app.appcomponents.di.MyApp
import kotlin.String

public data class PersonalityModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEditPhoto: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_edit_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUsername: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFirstName: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLastName: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHobby: String? = MyApp.getInstance().resources.getString(R.string.lbl_hobby)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDateOfBirth: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etAdalahalcanaValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etAlcanasatreValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etFourtaValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etSleepValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var et28May2002Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etIndonesianValue: String? = null
)
