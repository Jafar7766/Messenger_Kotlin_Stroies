package com.example.messenger_kotlin_stroies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var arrayList:ArrayList<ItemAdapter> ? = null
    private var gridView:GridView ? = null
    private var Adapter:Adapter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.my_grid_view_list)
        arrayList = ArrayList()
        arrayList = setDataList()
        Adapter = Adapter(applicationContext, arrayList!!)
        gridView?.adapter = Adapter
//        gridView?.onItemClickListener = this
    }

    private fun setDataList() : ArrayList<ItemAdapter>{
        var  arrayList: ArrayList<ItemAdapter> = ArrayList()

        arrayList.add(ItemAdapter(R.drawable.ic_baseline_add_circle_24,R.drawable.user2,"Add to Story"))
        arrayList.add(ItemAdapter(R.drawable.user2,R.drawable.pic2,"Jafar Bakhromov"))
        arrayList.add(ItemAdapter(R.drawable.pic5,R.drawable.pic5,"Kamollidin Anvarov"))
        arrayList.add(ItemAdapter(R.drawable.user2,R.drawable.pic2,"Begzod Uchqunov"))
        arrayList.add(ItemAdapter(R.drawable.pic5,R.drawable.user2,"Ziyodilla Nasrullayev"))
        arrayList.add(ItemAdapter(R.drawable.pic3,R.drawable.pic5,"Kamola Oripova"))
        arrayList.add(ItemAdapter(R.drawable.pic5,R.drawable.pic2,"Begzod Uchqunov"))
        arrayList.add(ItemAdapter(R.drawable.pic5,R.drawable.user2,"Ziyodilla Nasrullayev"))
        arrayList.add(ItemAdapter(R.drawable.pic5,R.drawable.pic2,"Kamola Oripova"))

        return arrayList

    }

//    override fun onItemClick(parent: AdapterView<*>?, position: View?, p2: Int, p3: Long) {
//          var items:ItemAdapter = arrayList!!.get(position)
//          Toast.makeText(applicationContext, items.name, Toast.LENGTH_LONG).show()
//
//    }
}
