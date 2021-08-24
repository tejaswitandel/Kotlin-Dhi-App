package com.mygitsynctest.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityLoginBinding
import com.mygitsynctest.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.mygitsynctest.app.modules.home.ui.HomeActivity
import com.mygitsynctest.app.modules.login.`data`.viewmodel.LoginVM
import com.mygitsynctest.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

public class LoginActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLoginBinding

  private val viewModel: LoginVM by viewModels<LoginVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
    binding.lifecycleOwner = this
    binding.loginVM = viewModel
    binding.linear6.setOnClickListener {

      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnNext.setOnClickListener {

      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.txtForgotPassword.setOnClickListener {

      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.txtForgotPassword.setOnClickListener {

      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "LOGIN_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
