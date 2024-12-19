package com.manish.sampledesignpattern.contract

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T?
}