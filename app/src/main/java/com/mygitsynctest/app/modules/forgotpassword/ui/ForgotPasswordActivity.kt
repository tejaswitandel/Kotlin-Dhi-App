package com.mygitsynctest.app.modules.forgotpassword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityForgotPasswordBinding
import com.mygitsynctest.app.modules.forgotpassword.`data`.viewmodel.ForgotPasswordVM
import com.mygitsynctest.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

public class ForgotPasswordActivity : AppCompatActivity() {
  private lateinit var binding: ActivityForgotPasswordBinding

  private val viewModel: ForgotPasswordVM by viewModels<ForgotPasswordVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_forgot_password)
    binding.lifecycleOwner = this
    binding.forgotPasswordVM = viewModel
    binding.btnStart.setOnClickListener {

              val destIntent = HomeActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public companion object {
    public const val TAG: String = "FORGOT_PASSWORD_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgotPasswordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
