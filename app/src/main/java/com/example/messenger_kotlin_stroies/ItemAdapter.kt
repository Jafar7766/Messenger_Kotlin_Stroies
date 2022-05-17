package com.example.messenger_kotlin_stroies

class ItemAdapter {

    var circle : Int ? = 0
    var icons:Int ? = 0
    var name: String ? = null

    constructor(circle: Int?, icons: Int?, name: String?){
        this.icons = icons
        this.name = name
        this.circle = circle
    }
}