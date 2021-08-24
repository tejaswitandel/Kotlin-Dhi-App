package com.mygitsynctest.app.modules.personality.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityPersonalityBinding
import com.mygitsynctest.app.modules.personality.`data`.viewmodel.PersonalityVM
import kotlin.String
import kotlin.Unit

public class PersonalityActivity : AppCompatActivity() {
  private lateinit var binding: ActivityPersonalityBinding

  private val viewModel: PersonalityVM by viewModels<PersonalityVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_personality)
    binding.lifecycleOwner = this
    binding.personalityVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PERSONALITY_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
