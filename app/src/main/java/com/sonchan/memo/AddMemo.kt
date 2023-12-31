package com.sonchan.memo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import com.sonchan.memo.databinding.ActivityAddMemoBinding

class AddMemo : AppCompatActivity() {

    private lateinit var binding: ActivityAddMemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityAddMemoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        binding.saveBtn.setOnClickListener {
            var title:Editable = binding.titleEdit.text
            var intext:Editable = binding.inEdit.text
        }
    }
}