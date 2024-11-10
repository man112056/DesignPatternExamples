package com.manish.sampledesignpattern

import android.content.Context

class EmailNotification: NotificationSystem {
    override fun sendNotification(): String {
        return " mk email notification triggered"
    }
}