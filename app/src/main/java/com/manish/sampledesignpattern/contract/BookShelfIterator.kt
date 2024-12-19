package com.manish.sampledesignpattern.contract

class BookShelfIterator(private val bookShelf: BookShelf): Iterator<Book> {
    private var index = 0
    override fun hasNext(): Boolean {
        return index < bookShelf.getLength()
    }
    override fun next(): Book {
        return bookShelf.getBookAt(index++)
    }
}