package com.example.pizzaorderapp_jaewhi.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
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

//      mList안에서 데이터 뽑아오기
        val data = mList[position]
        val storenameTxt = row.findViewById<TextView>(R.id.storeNameTxt)
        storenameTxt.text = data.name

//      CircleImageView도 ImageView로 찾아올 수 있다. -> 다용성의 개념..!
        val logoImg = row.findViewById<ImageView>(R.id.logoImg)

        Glide.with(mContext).load(data.logoURL).into(logoImg)

        return row

    }

}