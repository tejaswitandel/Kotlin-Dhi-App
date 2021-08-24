package com.mygitsynctest.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivitySignupBinding
import com.mygitsynctest.app.modules.home.ui.HomeActivity
import com.mygitsynctest.app.modules.login.ui.LoginActivity
import com.mygitsynctest.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.String
import kotlin.Unit

public class SignupActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySignupBinding

  private val viewModel: SignupVM by viewModels<SignupVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_signup)
    binding.lifecycleOwner = this
    binding.signupVM = viewModel
    binding.linear4.setOnClickListener {

              val destIntent = LoginActivity.getIntent(this, null)
              startActivity(destIntent)

            }
    binding.btnNext.setOnClickListener {

              val destIntent = HomeActivity.getIntent(this, null)
              startActivity(destIntent)

            }
  }

  public companion object {
    public const val TAG: String = "SIGNUP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
