package com.manish.sampledesignpattern


class EmailNotification: NotificationSystem {
    override fun sendNotification(): String {
        return " mk email notification triggered"
    }
}