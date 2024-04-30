class ContBancar:
    # constructorul
    def __init__(self, titularCont, iban):
        # atribute, fields
        self.titularCont = titularCont
        self.iban = iban
        self.sold = 0
        self.activ = False
        self.pin = 3456
        self.incercariActivare = 0

    # metode
    def salut(self):
        print(f'Buna, {self.titularCont}!')

    def interogareSold(self):
        print(f'Titular: {self.titularCont}')
        print(f'IBAN: {self.iban}')
        print(f'Sold: {self.sold}')
        print(f'Activ?: {self.activ}')
        print(f'Incercari gresite: {self.incercariActivare}')
        print()

    def activareCont(self, pin_utilizator):
        # print(f'Buna, {self.titularCont}!')
        self.salut()
        if pin_utilizator == self.pin:
            print(f'Card activat cu succes!')
            self.activ = True
        else:
            print(f'PINul introdus nu este corect!')
            # self.incercariActivare = self.incercariActivare +1
            self.incercariActivare+=1
        print()

    def alimentareCont(self, sumaDepusa):
        # print(f'Buna, {self.titularCont}!')
        self.salut()
        # self.sold = self.sold + sumaDepusa
        self.sold += sumaDepusa
        print(f'Ati alimentat cu suma de {sumaDepusa}')
        print(f'Aveti in cont {self.sold}')
        print()

    def plataCard(self, sumaCheltuita):
        # print(f'Buna, {self.titularCont}!')
        self.salut()
        if sumaCheltuita <= self.sold:
            self.sold -= sumaCheltuita
            print(f'Ai cheltuit {sumaCheltuita}')
            print(f'Mai ai {self.sold}')
        else:
            print(f'Fonduri insuficiente!')
        print()
