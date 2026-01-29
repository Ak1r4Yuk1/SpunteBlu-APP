package com.akira.spunteblu

import android.net.Uri
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // VERIFICA 1: Il file di layout si chiama activity_main.xml?
        setContentView(R.layout.activity_main)

        // VERIFICA 2: L'ID del WebView nell'XML si chiama ESATTAMENTE "webView"?
        // Se questa riga fallisce, l'app crasha subito (NullPointerException).
        val webView: WebView = findViewById(R.id.webView)

        // Configura le impostazioni necessarie per il funzionamento della web app
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true

        // Costruisci l'URL di base per caricare il file HTML locale
        val baseAssetUrl = "file:///android_asset/post_rebuilder.html"
        var finalUrlToLoad = baseAssetUrl

        val intent = intent
        val appLinkData: Uri? = intent.data

        if (appLinkData != null) {
            val pathSegments = appLinkData.pathSegments
            val slug = if (pathSegments.isNotEmpty()) pathSegments.last() else null

            if (slug != null && slug.isNotBlank()) {
                finalUrlToLoad = "$baseAssetUrl#post/$slug"
            }
        }

        // Carica l'URL finale
        webView.loadUrl(finalUrlToLoad)
    }
}
