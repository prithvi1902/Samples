package com.example.demo.viewmodeldemo

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne : Fragment(){

    var model = ShareViewModel()
    var button: Button? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        var view: View = inflater.inflate(R.layout.fragment_one, container, false)

        model = ViewModelProviders.of(this!!.activity!!).get(ShareViewModel::class.java)

        view.send.setOnClickListener{
            model.msg.value = editText.text.toString()

        }
        return view
    }
}
