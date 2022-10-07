# ArrayExamples

## main
Funkcja main zawiera wywołania wszystkich metod zdefiniowanych w klasie ArrayExamples.
Metody przyjmują tablicę array zdefiniowaną na początku metody main.
Metody "void", które nie zwracają żadnych danych tylko drukują informacje na ekran są wywoływane bezpośrednio np:
printArray. Metody, które zwracają dane np: findMax są wywoływane jako argumenty metody System.out.println().

## printArray
Metoda printArray wypisuje przekazaną w argumencie array tablice na ekran.
Dodaj metodę: \
void printArrayReversed(int [] array); \
i skopiuj do niej zwartośc printArray. Następnie zmodyfikuj metodę w taki sposób (zmień pętle for())
aby  wypisała elementy tablicy od ostatniego do pierwszego.

## findMax
Metoda findMax zwraca maksymalny element w przekazanej tablicy array.
Dodaj metodę: \
void findMin(int [] array); \
i skopiuj do niej zwartośc findMax. Następnie zmodyfikuj metodę w taki sposób (zmień pętle warunek if)
metoda zwróciła minimalny element w tablicy.

## sumArrayElements
Metoda sumArrayElements zwraca sumę elementów w przekazanej tablicy array.
Dodaj metodę: \
void sumEvenArrayElements(int [] array); \
i skopiuj do niej zwartośc sumArrayElements. Następnie zmodyfikuj metodę w taki sposób (dodaj w pętli warunek if)
aby metoda zsumowała elementy na parzystych indeksach. Np dla tablicy: \
{20, -8, 13, 1, 92, 2, 877, 32, 100} \
elementy kórych indeksy są parzyste  (indeks elementu jest podzielne przez 2) to \
{20, 13, 92, 877, 100}  
Pierwszym elementem jest 20 bo indeksy zaczynamy liczyć od 0.