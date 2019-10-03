package br.com.tccope

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.home_activity.*

class HomeActivity : AppCompatActivity() {

    var listPersonas: ArrayList<String> = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)


        if (this.listPersonas.size >= 0) {
            txtCadItems.visibility = View.GONE
        }else {
            txtCadItems.visibility = View.VISIBLE
        }

    }

    override fun onResume() {
        super.onResume()


    }

}


