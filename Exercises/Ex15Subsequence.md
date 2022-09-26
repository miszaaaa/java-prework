# Subsequence
Dane są dwie tablice - array i subsequence. Sprawdź czy elementy drugiej tablicy tworzą sekwencje w tablicy pierwszej. Elementy tworzące sekwencje nie muszą występować obok siebie, ale występują w tej samej kolejności w tablicy array1 co w tablicy subsequence.

## Przykład 1
array1 = {1, 2, **3, 4, 5**, 2, 4, 6, 8, 10, 11, 12}
subsequence = {3, 4, 5}
TAK - array1 zawiera sekwencję {3, 4, 5}


## Przykład 2
array1 = {1, 2, **3**, 4, **5**, 2, 4, 6, **8**, 10, 11, 12}
subsequence = {3, 5, 8}
TAK - array1 zawiera sekwencję {3, 5, 8}

## Przykład 3
array1 = {1, 2, 3, 4, 5, 2, 4, 6, 8, 10, 11, 12}
subsequence = {3, 5, 1}
NIE - array1 nie zawiera sekwencji {3, 5, 1}