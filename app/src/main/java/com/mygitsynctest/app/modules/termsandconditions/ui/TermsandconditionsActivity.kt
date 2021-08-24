package com.mygitsynctest.app.modules.termsandconditions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityTermsandconditionsBinding
import com.mygitsynctest.app.modules.termsandconditions.`data`.viewmodel.TermsandconditionsVM
import kotlin.String
import kotlin.Unit

public class TermsandconditionsActivity : AppCompatActivity() {
  private lateinit var binding: ActivityTermsandconditionsBinding

  private val viewModel: TermsandconditionsVM by viewModels<TermsandconditionsVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_termsandconditions)
    binding.lifecycleOwner = this
    binding.termsandconditionsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "TERMSANDCONDITIONS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TermsandconditionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
