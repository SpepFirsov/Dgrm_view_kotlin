package com.example.piechartkotlinreal

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidplot.pie.Segment
import com.androidplot.pie.SegmentFormatter
import kotlinx.android.synthetic.main.dgrm_pie.*

class pie_dgrm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dgrm_pie)

        val arrayList = intent.getIntegerArrayListExtra("arrayList")

        val P1 = Segment("Часть 1", arrayList.get(0))
        val P2 = Segment("Часть 2", arrayList.get(1))
        val P3 = Segment("Часть 3", arrayList.get(2))

        val sf1 = SegmentFormatter(Color.BLUE)
        val sf2 = SegmentFormatter(Color.GREEN)
        val sf3 = SegmentFormatter(Color.RED)

        pieChart.addSegment(P1,sf1)
        pieChart.addSegment(P2,sf2)
        pieChart.addSegment(P3,sf3)
    }
}