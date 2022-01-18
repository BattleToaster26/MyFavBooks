package com.example.myfavbooks

import androidx.recyclerview.widget.RecyclerView
import com.example.myfavbooks.databinding.BookCardCellBinding

class CardViewHolder(
    private val cardCellBinding: BookCardCellBinding
) : RecyclerView.ViewHolder(cardCellBinding.root)
{

    fun bindBook(book: Books){
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.title.text = book.title
        cardCellBinding.author.text = book.author
    }

}