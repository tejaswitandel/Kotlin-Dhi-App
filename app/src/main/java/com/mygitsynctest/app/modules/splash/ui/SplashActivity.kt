package com.mygitsynctest.app.modules.splash.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivitySplashBinding
import com.mygitsynctest.app.modules.loginsignup.ui.LoginSignupActivity
import com.mygitsynctest.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : AppCompatActivity() {
  private lateinit var binding: ActivitySplashBinding

  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_splash)
    binding.lifecycleOwner = this
    binding.splashVM = viewModel
    binding.image.setOnClickListener {

      val destIntent = LoginSignupActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"
  }
}
