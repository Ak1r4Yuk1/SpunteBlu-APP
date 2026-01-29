SpunteBlu-APP

SpunteBlu-APP è un'applicazione Android non ufficiale progettata per consultare tutti i post e le storie di SpunteBlu.it in modo fluido, veloce e, soprattutto, completamente gratuito e senza pubblicità (ADS).
🚀 Caratteristiche

    Visualizzazione pulita dei contenuti.

    Navigazione ottimizzata per dispositivi mobili.

    Zero interruzioni pubblicitarie.

    Integrazione nativa con i link del sito.

📲 Installazione (Download APK)

Se vuoi semplicemente utilizzare l'app sul tuo smartphone:

    Vai alla sezione Releases di questo repository.

    Scarica l'ultimo file .apk disponibile.

    Installa il file sul tuo dispositivo (assicurati di aver abilitato l'installazione da "Origini sconosciute").

🛠️ Compilazione e Build (Per Sviluppatori)

Se desideri compilare l'app autonomamente partendo dal codice sorgente, segui questi passaggi:
Requisiti

    Android Studio (versione Hedgehog o superiore consigliata)

    JDK 17 o superiore

Opzione 1: Usando l'interfaccia di Android Studio

    Clona il repository: git clone https://github.com/Ak1r4Yuk1/SpunteBlu-APP.git

    Apri il progetto in Android Studio.

    Vai su Build > Generate Signed Bundle / APK....

    Seleziona APK e clicca su Next.

    Creazione Key (Keystore):

        Se non hai una chiave, clicca su Create new....

        Scegli un percorso per il file .jks, inserisci una password e compila i dati richiesti (Alias, Validity, etc.).

    Seleziona la variante release e clicca su Finish. L'APK verrà generato nella cartella app/release/.

Opzione 2: Usando il Terminale (Gradle)

Per generare rapidamente un APK di release senza configurare manualmente il Keystore tramite interfaccia:
Bash

    ./gradlew assembleRelease
 
Nota: Assicurati di aver configurato correttamente il file signingConfigs nel tuo build.gradle se desideri un APK firmato per la distribuzione.
⚙️ Configurazione Fondamentale (Deep Linking)

Per un'esperienza ottimale, è necessario che i link del sito web si aprano automaticamente all'interno dell'app. Segui questi passaggi dopo l'installazione:

    Vai nelle Impostazioni del tuo smartphone.

    Seleziona App > SpunteBlu-APP.

    Cerca la voce "Apri per impostazione predefinita" o "Link supportati".

    Attiva l'opzione "Apri i link supportati" (o "Link da aprire in questa app").

    Assicurati di selezionare/spuntare tutti i domini elencati:

        spunteblu.it

        www.spunteblu.it

In questo modo, ogni volta che cliccherai su un link di SpunteBlu (da browser, WhatsApp o social), il post verrà visualizzato direttamente nell'app senza pubblicità.

📝 Note

Questo progetto è sviluppato a scopo informativo e personale per migliorare la leggibilità dei contenuti del sito originale. Tutti i diritti sui contenuti appartengono ai rispettivi proprietari di SpunteBlu.it.
