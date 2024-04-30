# dalmatienii
for i in range(1,102):
    print(f'Dalmatianul cu numarul {i}')

# din 2 in 2
for i in range(1,102,2):
    print(f'Dalmatianul cu numarul {i}')

numere = [3, 7, 5, 9, 4, 8, 6]
# parcurgere lista cu for prin intermediul indexului:
for i in range(0, len(numere)):
    print(f'Indexul curent este {i}')
    print(f'Numarul curent este {numere[i]}')

# for each:
for numar in numere:
    print(f'Numarul curent este {numar}')
s = 0
for numar in numere:
    print(f'Numarul curent este {numar}')
    s = s + numar
print(f'Suma numerelor este {s}')

# de cate ori apare 3 in [3, 2, 3, 5, 3]?
lista_numere = [3, 2, 3, 5, 3, 4, 3, 3, 4, 3]
cate = 0
for numar in lista_numere:
    if (numar == 3):
        cate+=1
print(f'Cifra 3 apare in sirul nostru de {cate} ori.')
