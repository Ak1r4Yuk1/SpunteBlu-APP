# SpunteBlu APP

Questa è un'applicazione non ufficiale per visualizzare i post del sito [Spunteblu.it](https://www.spunteblu.it) in modo gratuito, senza pubblicità e con un'interfaccia nativa per Android.

## Come Funziona

L'app permette di aprire direttamente i link dei post di `spunteblu.it`. Per un'esperienza ottimale, è necessario abilitare l'apertura dei link supportati direttamente nell'app.

### Abilitare l'apertura dei link

1.  Vai su **Impostazioni** del tuo dispositivo Android.
2.  Cerca **App > Gestione app > Spunteblu**.
3.  Trova la voce **Apri per impostazione predefinita** (o "Link da aprire in questa app").
4.  Attiva l'opzione e assicurati di aver selezionato i seguenti domini:
    *   `spunteblu.it`
    *   `www.spunteblu.it`

In questo modo, ogni volta che cliccherai su un link di un post di Spunteblu, si aprirà direttamente nell'app anziché nel browser.

## Come Compilare

Puoi compilare l'applicazione in due modi: tramite Android Studio o utilizzando Gradle.

### 1. Android Studio (Metodo Consigliato)

Questo è il metodo più semplice per compilare l'app, specialmente se vuoi creare una tua chiave di firma.

#### a. Creare una Chiave di Firma

Se non hai già una chiave di firma (`.jks`), puoi crearne una nuova seguendo questi passaggi:

1.  Apri il progetto in Android Studio.
2.  Vai su **Build > Generate Signed Bundle / APK...**.
3.  Seleziona **APK** e clicca su **Next**.
4.  Sotto il campo **Key store path**, clicca su **Create new...**.
5.  Compila i campi richiesti per creare la tua chiave. Salva il file `.jks` in una cartella sicura.
6.  Una volta creata la chiave, puoi chiudere la finestra di dialogo "Generate Signed Bundle".

#### b. Configurare il Progetto

1.  **Crea un file `local.properties`** nella directory `app` del progetto (se non esiste già).
2.  Aggiungi le seguenti righe al tuo file `local.properties`, sostituendo i valori con le tue informazioni:

    ```properties
    KEY_PATH=/percorso/assoluto/al/tuo/keystore.jks
    KEY_PASSWORD=la_tua_password
    KEY_ALIAS=il_tuo_alias
    ```

3.  **Compila l'APK**:
    *   Vai su **Build > Build Bundle(s) / APK(s) > Build APK(s)**.
    *   L'APK firmato si troverà in `app/build/outputs/apk/release/`.

### 2. Gradle

Se hai già configurato il file `local.properties` come descritto sopra, puoi compilare l'app direttamente da terminale.

1.  Apri un terminale nella directory principale del progetto.
2.  Esegui il seguente comando:

    *   Su Linux/macOS:
        ```shell
        ./gradlew assembleRelease
        ```
    *   Su Windows:
        ```shell
        gradlew.bat assembleRelease
        ```

3.  L'APK firmato si troverà in `app/build/outputs/apk/release/`.

## Download

Se preferisci non compilare l'app, puoi scaricare l'ultima versione direttamente dalla pagina delle **Releases** su GitHub.

*   **[Scarica l'ultima release](https://github.com/Ak1r4Yuk1/SpunteBlu-APP/releases)**
