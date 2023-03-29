package com.example.googlebookslab

import androidx.recyclerview.widget.RecyclerView
import com.example.googlebookslab.databinding.ListItemLayoutBinding
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

class BookViewHolder(val binding: ListItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentBook: Book

    fun bindBook(book: Book) {
        currentBook = book
    }


    companion object {

    }


}