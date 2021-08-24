package com.mygitsynctest.app.modules.wishlist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityWishListBinding
import com.mygitsynctest.app.modules.wishlist.`data`.viewmodel.WishListVM
import kotlin.String
import kotlin.Unit

public class WishListActivity : AppCompatActivity() {
  private lateinit var binding: ActivityWishListBinding

  private val viewModel: WishListVM by viewModels<WishListVM>()

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_wish_list)
    binding.lifecycleOwner = this
    binding.wishListVM = viewModel
  }

  public companion object {
    public const val TAG: String = "WISH_LIST_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WishListActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
