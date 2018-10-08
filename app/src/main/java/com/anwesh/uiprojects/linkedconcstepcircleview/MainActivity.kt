package com.anwesh.uiprojects.linkedconcstepcircleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.concstepview.ConcStepCircleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ConcStepCircleView.create(this)
    }
}
