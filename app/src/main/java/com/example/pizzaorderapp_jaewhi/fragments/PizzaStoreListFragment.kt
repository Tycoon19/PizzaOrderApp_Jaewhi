package com.example.pizzaorderapp_jaewhi.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorderapp_jaewhi.R
import com.example.pizzaorderapp_jaewhi.ViewStoreDetailActivity
import com.example.pizzaorderapp_jaewhi.adapters.PizzaStoreAdapter
import com.example.pizzaorderapp_jaewhi.datas.Store
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment : Fragment(){

    val mPizzaStoreDataList = ArrayList<Store>()

    lateinit var mPizzaStoreAdapter : PizzaStoreAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_pizza_store_list, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        동작 관련 코드

        mPizzaStoreDataList.add(Store("A피자가게","1111-2222","https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))
        mPizzaStoreDataList.add(Store("B피자가게","3333-4444","https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreDataList.add(Store("C피자가게","5555-6666","https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreDataList.add(Store("D피자가게","7777-8888","https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))

        mPizzaStoreAdapter = PizzaStoreAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreDataList)
        pizzaStoreListView.adapter = mPizzaStoreAdapter

        pizzaStoreListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStore = mPizzaStoreDataList[position]
            val myIntent = Intent(context,ViewStoreDetailActivity::class.java)
            myIntent.putExtra("Store",clickedStore)
            startActivity(myIntent)

        }

    }

}