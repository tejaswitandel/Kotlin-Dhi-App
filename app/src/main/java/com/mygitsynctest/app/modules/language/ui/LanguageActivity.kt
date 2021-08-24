package com.mygitsynctest.app.modules.language.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityLanguageBinding
import com.mygitsynctest.app.modules.language.`data`.viewmodel.LanguageVM
import kotlin.String
import kotlin.Unit

public class LanguageActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLanguageBinding

  private val viewModel: LanguageVM by viewModels<LanguageVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_language)
    binding.lifecycleOwner = this
    binding.languageVM = viewModel
  }

  public companion object {
    public const val TAG: String = "LANGUAGE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LanguageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
