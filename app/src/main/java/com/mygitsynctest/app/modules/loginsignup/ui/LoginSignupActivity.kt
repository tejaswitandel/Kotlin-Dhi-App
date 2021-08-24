package com.mygitsynctest.app.modules.loginsignup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityLoginSignupBinding
import com.mygitsynctest.app.modules.login.ui.LoginActivity
import com.mygitsynctest.app.modules.loginsignup.`data`.viewmodel.LoginSignupVM
import com.mygitsynctest.app.modules.signup.ui.SignupActivity
import kotlin.String
import kotlin.Unit

public class LoginSignupActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLoginSignupBinding

  private val viewModel: LoginSignupVM by viewModels<LoginSignupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_login_signup)
    binding.lifecycleOwner = this
    binding.loginSignupVM = viewModel
    binding.btnSignUp.setOnClickListener {

          val destIntent = SignupActivity.getIntent(this, null)
          startActivity(destIntent)

        }
    binding.btnLogin.setOnClickListener {

          val destIntent = LoginActivity.getIntent(this, null)
          startActivity(destIntent)

        }
  }

  public companion object {
    public const val TAG: String = "LOGIN_SIGNUP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginSignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
