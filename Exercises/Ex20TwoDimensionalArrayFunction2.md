# 2d Arrays Function
Napisz funkcję, która przyjmie dwa argumenty - m i n będące rozmiarami dwuwymiarowej tablicy.
Funkcja utworzy tablicę array o liczbie kolumn n i liczbie wierwszy m, 
wypełni pola  wg. reguły
1. Jeżeli indeks kolumny jest parzysty 1
2. Jeżeli indeks wiersza jest parzysty 2
3. Jeżeli indeks kolumny i wiersza są parzyste 3 \

i zwróci tablicę.

int [][] create2dArray(int n, int m);

## Przykład
Dla n = 3 i m = 3 funkcja powinna zwrócić tablicę
{
{3, 2, 3},
{1, 0, 1},
{3, 2, 3}
}