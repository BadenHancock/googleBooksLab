package com.example.googlebookslab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.googlebookslab.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val viewModel: BookViewModel by viewModels()

    val books: List<Book> = listOf(Book("aaaa", "AAAAAAAAA", "1388620296020"), Book("1.1", "117km NW of Talkeentna, Alaska", "1388620046501"))


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        val mAdapter = BookAdapter(books)
        binding.recyclerView.adapter = mAdapter

        viewModel.getBooks()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}