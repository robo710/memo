package com.sonchan.memo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sonchan.memo.databinding.ActivityAddMemoBinding

class AddMemo : AppCompatActivity() {
    private lateinit var binding: ActivityAddMemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAddMemoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}