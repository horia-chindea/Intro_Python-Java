def print_greeting():
    print('Buna ziua! Bine ati venit!')
def print_greeting_by_name(nume,prenume):
    print(f'Buna ziua {nume} {prenume}')

def media_nr(a, b, c):
    return (a + b + c) / 3

def pi_value():
    return 3.14

def verificare_major(varsta):
    if varsta >= 18:
        return True
    else:
        return False



# zona de apelare:
print_greeting()
print_greeting()
print_greeting_by_name('Chindea','Horia')
print_greeting_by_name('Chindea','Anca')
print_greeting_by_name('Chindea','Calin')
print(media_nr(3, 5, 9))
print(pi_value())
print(verificare_major(19))

# se ia de la tastatura varsta
varsta = int(input('Introduceti varsta: '))
if verificare_major(varsta):
    print('Cont creat. Bine ai venit in aplicatie!')
else:
    print('Nu ai varsta minima necesara (18)!')

# in OOP (Object Oriented Programming):
# variabile => atribute, proprietati sau fields
# functii => metode
