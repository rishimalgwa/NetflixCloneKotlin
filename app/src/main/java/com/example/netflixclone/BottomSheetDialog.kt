package com.example.netflixclone
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetDialog : BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(
           R.layout.bottom_sheet_layout,
            container, false
        )

//        algo_button.setOnClickListener {
//            Toast.makeText(
//                activity,
//                "Algorithm Shared", Toast.LENGTH_SHORT
//            )
//                .show()
//            dismiss()
//        }


    }
}
