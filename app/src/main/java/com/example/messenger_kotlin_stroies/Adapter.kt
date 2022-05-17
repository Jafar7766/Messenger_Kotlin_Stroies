package com.example.messenger_kotlin_stroies

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class Adapter(var context: Context, var  arraList: ArrayList<ItemAdapter>):BaseAdapter() {
    override fun getCount(): Int {
       return arraList.size
    }

    override fun getItem(position: Int): Any {
       return arraList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
          var view:View = View.inflate(context, R.layout.card_grid,null)
          var circle: ImageView = view.findViewById(R.id.im_circle)
          var icons: ImageView = view.findViewById(R.id.icons)
          var name: TextView = view.findViewById(R.id.tv_first)

          var listItem:ItemAdapter =  arraList.get(position)
          icons.setImageResource(listItem.icons!!)
          name.text = listItem.name
          circle.setImageResource(listItem.circle!!)



          return view
    }

}