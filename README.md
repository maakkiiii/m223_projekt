# m223_projekt
Abschlussprojekt für das Modul 223. Client-Server Applikation.
Die Applikation ist ein Coworking Space für eine Firma. Verschiedene Rollen haben verschiedene Rechte.

1. Projekt aufsetzen
Stellen sie sicher das sie eine JDK und gradle installiert haben. Die Versionen sollen auch kompatibel sein. 
Sie können das Projekt aus diesem Github Repository forken bzw. kopieren und zu sich herunterladen. 
Danach sollen sie die application.properties überprüfen und sicherstellen das die Datenbankverbindung und alle anderen Einstellungen richtig eingestellt sind. Um das Projekt dann zum ersten mal zu starten nutzt man den Befehl "gradle build" in der Kommandozeile.

2. Projekt starten
Um das Projekt zu starten muss man in der Kommandozeile den Befehl "./gradlew bootRun" ausführen. Um die Docker Container zu starten nutzt man den Befehl "docker compose up". Danach wird die Anwendung über den Port 8081 ausgegeben. Die Datenbank über den Port 3306.

3. Testdaten abrufen
Um die Testdaten abzurufen sollte man ein Programm wie Postman brauchen. Mit diesem Programm kann man gut API Tests mit REST ausführen. Es werden auch Testdaten durch die Mainklasse geladen. 

