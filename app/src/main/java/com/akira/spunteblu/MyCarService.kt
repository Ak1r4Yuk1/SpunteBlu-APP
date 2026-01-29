package com.akira.spunteblu

import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator
import androidx.car.app.model.*
import androidx.car.app.CarContext
import androidx.car.app.Screen
import android.content.Intent

class MyCarService : CarAppService() {
    override fun createHostValidator(): HostValidator = HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    override fun onCreateSession(): Session = MyCarSession()
}

class MyCarSession : Session() {
    override fun onCreateScreen(intent: Intent): Screen = MyCarScreen(carContext)
}

class MyCarScreen(carContext: CarContext) : Screen(carContext) {
    private var count = 0
    override fun onGetTemplate(): Template {
        return PaneTemplate.Builder(
            Pane.Builder()
                .addRow(Row.Builder().setTitle("Test Movimento").addText("Contatore: $count").build())
                .addAction(Action.Builder()
                    .setTitle("Incrementa")
                    .setOnClickListener { count++; invalidate() }
                    .build())
                .build()
        )
        .setTitle("Spunteblu Viaggio")
        .setHeaderAction(Action.APP_ICON)
        .build()
    }
}