Objektorienterad programmering
Övning 1:

Skapa en klass Rectangle enligt nedan samt skriv ett program som använder din Rectangle-klass
● har fyra instansvariabler: x, y, width och height
● har tre konstruktörer
    1. en som inte tar emot ngt och som sätter alla instansvariabler till 0
    2. en som tar emot två värden som sätts in i width och height medan x och y sätts till 0
    3. en som tar emot fyra värden som används för att sätta de fyra instansvariablerna
● en instansmetod calculateArea som returnerar en double med rektangelns area
● en instansmetod calculatePerimeter som returnerar en double med rektangelns omkrets
● en instansmetod setXY som låter dig sätta instansvariablerna x och y
● två instansmetoder setWidth och setHeight som låter dig sätta motsvarande instansvariabler

Utmaning:
Lägg till en metod checkCollision i Rectangle-klassen som tittar på två rektanglar om det finns överlapp. Instansvariablerna x och y refererar till övre vänstra hörnet på en rektangel.
