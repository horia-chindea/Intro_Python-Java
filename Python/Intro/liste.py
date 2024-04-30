# in Python se lucreaza doar cu liste, nu cu array
# listele in Python pot cuprinde elemente de tipuri diferite
# listele au dimensiune dinamica
fructe = ['mar' , 'banana', 'portocala', 3, True, 3]

# afisarea unei liste:
print(fructe)

# accesam un element in functie de index
print(fructe[1])

# adaugarea unui nou element
fructe.append('tomata')

# suprascrierea unui element
fructe[0] = 'para'
print(fructe)

# aflam dimensiunea
print(len(fructe))

# scoate (sterge) si ne returneaza ultimul element (dar il si tine minte - il putem stoca intr-o variabila)
last = fructe.pop()
print(last)
print(fructe)

# de cate ori apare un element:
print(fructe.count(3))

# extend = extinde lista:
fructe_exotice = ['ananas', 'kiwi']
fructe.extend(fructe_exotice)
print(fructe)