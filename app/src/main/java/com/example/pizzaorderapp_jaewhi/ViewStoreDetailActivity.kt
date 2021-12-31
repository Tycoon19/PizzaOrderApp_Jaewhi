package com.example.pizzaorderapp_jaewhi

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.pizzaorderapp_jaewhi.datas.Store
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
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

        callBtn.setOnClickListener {

            val permissionListener = object : PermissionListener{
                override fun onPermissionGranted() {

                    val myUri = Uri.parse("tel:010-${mStoreData.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL,myUri)
                    startActivity(myIntent)

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                    Toast.makeText(mContext,"권한이 없어서 전화 연결에 실패했습니다.",Toast.LENGTH_SHORT).show()

                }

            }

            TedPermission.create()
                .setPermissionListener(permissionListener)
                .setDeniedMessage("전화 연결 권한이 필요합니다. [설정]에서 진행해주세요.")
                .setPermissions(Manifest.permission.CALL_PHONE)
                .check()

        }

    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("Store") as Store
//      BaseActivity에서 mContext 받아오기
        Glide.with(mContext).load(mStoreData.logoURL).into(logoImg)

        storeNameTxt.text = mStoreData.name
        storePhoneNumTxt.text = mStoreData.phoneNum

    }


}