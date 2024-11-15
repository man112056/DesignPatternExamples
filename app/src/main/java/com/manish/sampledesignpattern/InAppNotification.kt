package com.manish.sampledesignpattern


class InAppNotification: NotificationSystem {
    override fun sendNotification(): String {
        return "in app notification triggered"
    }
}