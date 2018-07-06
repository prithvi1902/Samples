package com.example.demo.viewmodeldemo


import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_two.*

class FragmentTwo : Fragment() {

    var model = ShareViewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_two, container, false)

        model = ViewModelProviders.of(this!!.activity!!).get(ShareViewModel::class.java)
        model.msg.observe(this, Observer {
            display.setText(it)
        })

        return view
    }
}
