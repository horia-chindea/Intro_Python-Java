# masina merge atata timp cat are comustibil
litri_combust = 10
while litri_combust > 0:
    # acceleram
    print(f'Mai avem {litri_combust} litri de combustibil. Acceleram! Consumam combustibil!')
    # aprindem beculetul daca avem 3 litri de combustibil sau mai putin:
    if litri_combust <= 3:
        print('Se aprinde beculetul rosu! Alimenteaza cu combustibil!')
    litri_combust = litri_combust - 1
    if litri_combust == 0:
        print('Ti s-a terminat combustibilul!')
print('Masina se opreste din lipsa de combustibil!')
