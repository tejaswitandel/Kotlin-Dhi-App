package com.mygitsynctest.app.modules.worktodays.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.ActivityWorkTodaySBinding
import com.mygitsynctest.app.modules.wishlist.ui.WishListActivity
import com.mygitsynctest.app.modules.worktodays.`data`.model.WorkTodayS1RowModel
import com.mygitsynctest.app.modules.worktodays.`data`.viewmodel.WorkTodaySVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class WorkTodaySActivity : AppCompatActivity() {
  private lateinit var binding: ActivityWorkTodaySBinding

  private val viewModel: WorkTodaySVM by viewModels<WorkTodaySVM>()

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: WorkTodayS1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onCreate(savedInstanceState: Bundle?): Unit {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this,R.layout.activity_work_today_s)
    val recyclerViewAdapter = RecyclerViewAdapter(arrayListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : WorkTodayS1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    binding.lifecycleOwner = this
    binding.workTodaySVM = viewModel
    binding.btnMakeAWishLis.setOnClickListener {

      val destIntent = WishListActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public companion object {
    public const val TAG: String = "WORK_TODAY_S_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WorkTodaySActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
