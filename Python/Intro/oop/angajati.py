class Angajati:
    # constructorul:
    def __init__(self,nume,prenume,functie,vechime,salariu):
        self.nume = nume
        self.prenume = prenume
        self.functie = functie
        self.vechime = vechime
        self.salariu = salariu

    # metode:
    def descriereAngajat(self):
        print(f'Numele: {self.nume}')
        print(f'Prenumele: {self.prenume}')
        print(f'Functia: {self.functie}')
        print(f'Vechimea: {self.vechime}')
        print(f'Salariu: {self.salariu}')
        print()

    def actualizareVechime(self):
        print(f'Se actualizeaza vechimea pentru {self.nume} {self.prenume}.')
        self.vechime += 1
        print()

    def marireSalariu(self):
        if self.vechime >= 3:
            self.salariu = self.salariu + 500
        else:
            self.salariu = self.salariu + 300
        print(f'S-a marit salariul pentru {self.nume} {self.prenume}')
        print()