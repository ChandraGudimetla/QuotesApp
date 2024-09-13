package com.example.quotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotesapp.model.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick: (quote: Quote)-> Unit){
    LazyColumn {
        items(data){
            QuoteListItem(quote = it, onClick)
        }
    }
}