package com.manish.sampledesignpattern


class SmsNotification: NotificationSystem {
    override fun sendNotification(): String {
        return "SmsNotification got triggered"
    }
}