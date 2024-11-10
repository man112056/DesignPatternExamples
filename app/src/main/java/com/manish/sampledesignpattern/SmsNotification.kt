package com.manish.sampledesignpattern

import android.content.Context

class SmsNotification: NotificationSystem {
    override fun sendNotification(): String {
        return "SmsNotification got triggered"
    }
}