## Readme

Vieles ist in diesem Projekt sehr gut gelaufen. 
Zum Beispiel war das aufsetzten des Projekts und das Finden der passenden Daten sehr einfach.
Wir haben einen Datensatz von Opendata.swiss genommen, da wir es toll finden, dass dort reale Daten
zur verfügung stehen und nicht einfach nur Dummy-Daten.

Die Schwierigkeiten kamen erst mit der Verarbeitung der Daten. 
Das CSV mit den Daten über den Hundebestand der Stadt Zürich war eher suboptimal aufgebaut. 
Es gab viele Redundanzen, da Besitzer und Hunde auf der gleichen Tabelle waren. 
Besitzer können mehrere Hunde haben, deshalb gab es viele Spalten mit dem gleichen Besitzer.
Wir habe dann das CSV in zwei Tables aufgesplitet. Die war Aufwendig. Zusätzlich hatten wir noch Probleme
mit den Queries, da die Spalten mit Underscores benannt wurden (geschlecht_hund). Die gab Probleme mit JPA bzw.
konnten Queries nut mit @Query germacht werden. Darum haben wir die Spalten dann umbenannt.

Abschliessend können wir aber sagen, dass das Projekt gut gegangen ist. 
Als Note erwarten wir c.a. eine 5.25