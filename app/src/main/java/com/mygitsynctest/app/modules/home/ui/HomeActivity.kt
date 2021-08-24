package com.mygitsynctest.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityHomeBinding
import com.mygitsynctest.app.modules.home.`data`.viewmodel.HomeVM
import com.mygitsynctest.app.modules.personality.ui.PersonalityActivity
import com.mygitsynctest.app.modules.settings.ui.SettingsActivity
import com.mygitsynctest.app.modules.worktodays.ui.WorkTodaySActivity
import kotlin.String
import kotlin.Unit

public class HomeActivity : AppCompatActivity() {
  private lateinit var binding: ActivityHomeBinding

  private val viewModel: HomeVM by viewModels<HomeVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_home)
    binding.lifecycleOwner = this
    binding.homeVM = viewModel
    binding.linear4.setOnClickListener {

              val destIntent = SettingsActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.linear3.setOnClickListener {

              val destIntent = WorkTodaySActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.linear2.setOnClickListener {

              val destIntent = PersonalityActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public companion object {
    public const val TAG: String = "HOME_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
