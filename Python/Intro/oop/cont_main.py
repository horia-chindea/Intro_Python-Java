# importam clasa ContBancar:
from oop.cont_bancar import ContBancar

cont1 = ContBancar('Chindea Horia','RO0001')
cont2 = ContBancar('Chindea Anca','RO0002')

cont1.activareCont(3456)
cont2.activareCont(1111)
cont2.activareCont(3333)
cont2.activareCont(3456)

cont1.alimentareCont(3200.75)
cont2.alimentareCont(2655.34)
cont2.alimentareCont(1645.23)

cont1.plataCard(6400)
cont1.plataCard(3200.03)
cont2.plataCard(4132.26)


cont1.interogareSold()
cont2.interogareSold()


# TEMA:
# clasa Angajat
# nume, prenume, functie, salariu, vechime
# constructor: nume, prenume, functie, salariu, vechime
# metode: descriere();
# actualizare vechime
# marire salariu in functie de vechime (daca are sub 5 ani -> >300 lei; altfel >500 lei)