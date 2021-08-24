package com.mygitsynctest.app.modules.wishlist.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mygitsynctest.app.modules.wishlist.`data`.model.WishListModel

public class WishListVM : ViewModel() {
  public val wishListModel: MutableLiveData<WishListModel> = MutableLiveData(WishListModel())
}
