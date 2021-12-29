package com.example.pizzaorderapp_jaewhi.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.pizzaorderapp_jaewhi.R
import com.example.pizzaorderapp_jaewhi.datas.Store

class PizzaStoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Store>
) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){
            tempRow = inflater.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        return row

    }

}