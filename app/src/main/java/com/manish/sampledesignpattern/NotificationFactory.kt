package com.manish.sampledesignpattern

object NotificationFactory {

    fun sendNotification(type: String): NotificationSystem {
        if (type == "inApp") {
            return InAppNotification()
        } else if (type == "email") {
            return EmailNotification()
        } else {
            return SmsNotification()
        }
    }
}