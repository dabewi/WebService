# WebService
Kleiner REST Web Service auf Basis von Spring Boot, der zu einem ISO-3166-Ländercode das entsprechende Land zurückgibt.

Nach dem Starten der Spring Boot Applikation via mvn spring-boot:run kann im Browser über http://localhost:8080/iso?isoCode=XX ein beliebiges gelistetes Land abgerufen werden.

Zum Beispiel http://localhost:8080/iso?isoCode=DE ergibt Deutschland.
