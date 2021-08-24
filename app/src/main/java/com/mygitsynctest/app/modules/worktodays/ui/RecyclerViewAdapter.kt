package com.mygitsynctest.app.modules.worktodays.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mygitsynctest.app.R
import com.mygitsynctest.app.databinding.RowWorkTodayS1Binding
import com.mygitsynctest.app.modules.worktodays.`data`.model.WorkTodayS1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public val list: List<WorkTodayS1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowWorkTodayS1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowWorkTodayS1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_work_today_s1,parent,false)
    return RowWorkTodayS1VH(view)
  }

  public override fun onBindViewHolder(holder: RowWorkTodayS1VH, position: Int): Unit {
    val workTodayS1RowModel = WorkTodayS1RowModel()
    // TODO uncomment following line after integration with data source
    // val workTodayS1RowModel = list[position]
    holder.binding.workTodayS1RowModel = workTodayS1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: WorkTodayS1RowModel
    ): Unit {
    }
  }

  public inner class RowWorkTodayS1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowWorkTodayS1Binding = RowWorkTodayS1Binding.bind(itemView)
  }
}
