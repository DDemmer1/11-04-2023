# 11-04-2023
SS 23 - Wiederholung - Klassen, Objekte, Datentypen

### 📝 Aufgabe:

Wir stellen uns vor, dass wir in einem Team am Backend eines Webshops arbeiten und gerade eine Struktur zum verwalten der Waren aufbauen. Der Verkaufspreis dieser Waren darf auf keinen Fall von anderen Entwicklern unter 0 gesetzt werden.

Erstellt eine Klasse ```Item``` mit folgenden Attributen:
 - ```double price```, ```String name```
 
Setzt alle Attribute von ```Item``` auf ```private```. Die Attribute können jetzt nur noch in der ```Item``` Klasse verwendet werden. Um den zugriff von außen zu ermöglichen verwenden wir Methoden.

Schreibt für jedes Attribut jeweils zwei Methoden die uns den Zugriff ermöglichen. Hier als bsp. für ```String name```:
1. getName() - gibt als Rückgabewert den ```String name``` zurück
2. setName(String neuerName) - nimmt als Parameter einen ```String``` und ändert entsprechend den wert des ```String name``` in der Klasse

------------------------------

In der ```set``` Methode des Attributes ```double price``` soll verhindert werden das der Wert unter 0 gesetzt wird. Wenn das trotzdem versucht wird soll der Wert von ```double price``` auf 0 gesetzt werden und eine Warnung in der Konsole ausgegeben werden

  
  
  
### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos
- [ 🎥 GitHub Projekte in Eclipse importieren](https://drive.google.com/file/d/1IpwHADmwViEGQ7Pf4BgybUYpz7WBoMe5/view?usp=sharing)
