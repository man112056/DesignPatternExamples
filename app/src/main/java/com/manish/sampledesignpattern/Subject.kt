package com.manish.sampledesignpattern

open class Subject {
    private var observers: MutableList<Observer> = mutableListOf()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        if (observers.isNotEmpty()) {
            observers.remove(observer)
        }
    }

    fun updateData(newData: String) {
        for (observer in observers) {
            observer.onDataChange(newData)
        }
    }
}