package com.mygitsynctest.app.modules.settings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivitySettingsBinding
import com.mygitsynctest.app.modules.language.ui.LanguageActivity
import com.mygitsynctest.app.modules.personality.ui.PersonalityActivity
import com.mygitsynctest.app.modules.settings.`data`.viewmodel.SettingsVM
import com.mygitsynctest.app.modules.termsandconditions.ui.TermsandconditionsActivity
import kotlin.String
import kotlin.Unit

public class SettingsActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySettingsBinding

  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_settings)
    binding.lifecycleOwner = this
    binding.settingsVM = viewModel
    binding.btnPersonality.setOnClickListener {

          val destIntent = PersonalityActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnTermsAndCondi.setOnClickListener {

          val destIntent = TermsandconditionsActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnLanguage.setOnClickListener {

          val destIntent = LanguageActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public companion object {
    public const val TAG: String = "SETTINGS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
