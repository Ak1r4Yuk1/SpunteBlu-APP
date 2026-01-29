package com.akira.spunteblu

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator
import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.*

class AABrowserCarAppService : CarAppService() {
    override fun createHostValidator(): HostValidator {
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        return object : Session() {
            override fun onCreateScreen(intent: Intent): Screen {
                return object : Screen(carContext) {
                    override fun onGetTemplate(): Template {
                        return MessageTemplate.Builder("Sistema Pronto")
                            .setTitle("Spunteblu Viaggio")
                            .setHeaderAction(Action.BACK)
                            .build()
                    }
                }
            }
        }
    }
}