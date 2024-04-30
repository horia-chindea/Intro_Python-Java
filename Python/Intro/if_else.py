# if:
piesa_faina = True
print('Pornesc radio;')
print(f'Ii faina piesa? => {piesa_faina}')
if piesa_faina == True :
    print('Dau mai tare radio;')
    print('Incep sa ma batzai penibil')
    print('Pisicile se uita la mine nedumerite pana se termina piesa;')
print('Opresc radio;')

# if; else
# daca numarul este par printam "Numarul este par"
# altfel printam "Numarul este impar"
nr = 5
if nr % 2 == 0:
    print(f'Numarul {nr} este par.')
else:
    print(f'Numarul {nr} este impar.')

# verificare numar pozitiv:
if nr > 0:
    print(f'Numarul {nr} este pozitiv.')
else:
    print(f'Numarul {nr} nu este pozitiv.')

# revin la radio:
print('Revin la radio;')
# intorc pe dos valoarea variabilei piesa_faina
if piesa_faina == True:
    piesa_faina = False
else:
    piesa_faina = True
print('Pornesc radio;')
print(f'Ii faina piesa? => {piesa_faina}')
if piesa_faina == True :
    print('Dau mai tare radio;')
    print('Incep sa ma batzai penibil')
    print('Pisicile se uita la mine nedumerite pana se termina piesa;')
else:
    print('Ma stramb dezgustat;')
    print('Pisicile dorm in continuare linistite;')
print('Opresc radio;')

# if; else if; else
# Salutul robotelului in functie de ora
# Luam date de la tastatura si transformam datele din str in int
ora = int(input('Introdu ora: '))
if ora < 0:
    print(f'Ora {ora} nu este valida!')
elif ora <= 11:
    print('Buna dimineata!')
elif ora <=18:
    print('Buna ziua!')
elif ora <=21:
    print('Buna seara!')
elif ora <=24:
    print('Noapte buna!')
else:
    print(f'Ora {ora} nu este valida!')

# Ctrl + / aplicat pe o selectie de cod comenteaza intreaga selectie.
# daca textul selectat contine doar commenturi, aceeasi combinatie decomenteaza selectia.

# robotel telefonic
optiune = int(input('Alege optiunea: '))
if optiune == 0:
    print("Meniul anterior")
elif optiune == 1:
    print("Limba romana")
elif optiune == 2:
    print("Limba engleza")
else:
    print("Nu stiu ce-ti trebuie. Mai incearca!")
