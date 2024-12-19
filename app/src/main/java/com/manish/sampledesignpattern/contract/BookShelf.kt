package com.manish.sampledesignpattern.contract

import kotlin.collections.Iterator

class BookShelf: Iterable<Book> {

    private val books = mutableListOf<Book>()
    fun addBook(book: Book) {
        books.add(book)
    }
    fun getLength() = books.size
    fun getBookAt(index: Int) = books[index]

    override fun iterator(): Iterator<Book> = BookShelfIterator(this)
}