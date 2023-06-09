## Projektrapport: WeatherAPIService TDD

####   Ert namn:
Wakana Sugihara

#### Beskrivning av projektet
Sakapa Mock Test för WeatherAPIService Klass

#### Vad ni har gjort
Skapade TDD test som använder Mock.

#### Arbetet och dess genomförande
Först Skapade jag WeatherAPI och GetWeatherData Klasser.
Och sen skapade jag weatherServiceFacade klass med bara metod och Test.
Det tog long tid att komma på hur jag skall skriva Test.

#### Vad som varit svårt
Det tog tid att komma farm till att göra mock på grund av osäkerhets.

#### Beskriv lite olika lösningar du gjort
Det tog ganska lång tid att hitta ett sätt att hantera JSON-objekt och returnera en
instans av GetWeatherData-klassen i metoden public GetWeatherData fromJson
(String json) i klassen GetWeatherData.

#### Beskriv något som var besvärligt att få till
Jag var osäker på vad jag skulle testa i själva testet. Jag var osäker på om jag borde
kontrollera värdena som returneras från API:et och om detta var tillräckligt för att testa.



## Slutsatser
#### Vad gick bra
Jag var väldigt förvirrad om var och hur jag skulle använda mockning, men till slut
lyckades jag skapa mocktester. Genom den här uppgiften har jag fått en bättre
förståelse för hur man skriver mockningar jämfört med tidigare.

#### Vad gick dåligt
Jag var osäker hela vägen om jag hade rätt tillvägagångssätt för min uppgift och vilka
värden jag skulle testa.

#### Vad har du lärt dig

En mock är när man mockar värden från en annan klass som används i den klass man
vill testa.

#### Vad hade ni gjort annorlunda om ni gjort om projektet
Nu när jag har en bättre förståelse för mockning kan jag förmodligen skriva tester
snabbare.
#### Vilka möjligheter ser du med de kunskaper du fått under kursen.
Det är vetting att använda när vi testar tex mot Databasen.
Så kan man testa koda utan att koppla upp till database.
