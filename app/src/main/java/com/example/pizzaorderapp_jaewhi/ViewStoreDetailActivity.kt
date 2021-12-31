package com.example.pizzaorderapp_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.pizzaorderapp_jaewhi.datas.Store
import kotlinx.android.synthetic.main.activity_view_store_detail.*

class ViewStoreDetailActivity : BaseActivity() {
//  실제로 데이터를 집어넣는건 onCreate 이후인 setValues에서할거임. 만드는건 지금이지만 나중에 채워줄께~!
    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
        setupEvents()
        setValues()




}
    override fun setupEvents() {

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("Store") as Store
//      BaseActivity에서 mContext 받아오기
        Glide.with(mContext).load(mStoreData.logoURL).into(logoImg)

        storeNameTxt.text = mStoreData.name
        storePhoneNumTxt.text = mStoreData.phoneNum

    }


}