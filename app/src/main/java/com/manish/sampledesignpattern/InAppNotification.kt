package com.manish.sampledesignpattern

import android.content.Context

class InAppNotification: NotificationSystem {
    override fun sendNotification(): String {
        return "in app notification triggered"
    }
}