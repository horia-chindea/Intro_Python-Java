from oop.angajati import Angajati

daniel = Angajati('Popescu','Daniel','Consilier',12,5500)
georgel = Angajati("Ionescu",'Georgel','Referent',3,2800)

daniel.descriereAngajat()
georgel.descriereAngajat()

georgel.actualizareVechime()
georgel.descriereAngajat()

daniel.marireSalariu()
daniel.descriereAngajat()
