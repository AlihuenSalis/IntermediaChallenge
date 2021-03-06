package com.intermediachallenge.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.intermediachallenge.databinding.ActivityMainBinding
import com.intermediachallenge.ui.Adapter.CharacterAdapter
import com.intermediachallenge.ui.viewModel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CharacterAdapter

    private val quoteViewModel : QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        quoteViewModel.dataModel.observe(this, Observer {
            // TODO LO QUE ESTA ACA DENTRO ESTA ENGANCHADO AL LIVE DATA
            adapter = CharacterAdapter(it.data?.results ?: emptyList())
            binding.recyclerCharacter.layoutManager = LinearLayoutManager(this)
            binding.recyclerCharacter.adapter = adapter
//            binding.tvQuote.text = it.attributionText
//            binding.tvAuthor.text = it.status
//            binding.tvQuote.text = it.quote
//            binding.tvAuthor.text = it.author
        })

        quoteViewModel.isLoading.observe(this, Observer {
            binding.progress.isVisible = it
        })

//        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }
}