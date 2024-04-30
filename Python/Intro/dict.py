# dict = dictionary = map-ul din Java
# declaram si initializam un dict
note_elevi = {'Gigel': 10, 'Costel': 9, 'Ana': 9}

# adaugarea de elemente:
note_elevi['Sebi'] = 7

# printam dictul
print(note_elevi)

# aflarea elementelor:
print(note_elevi['Gigel'])
# sau
print(note_elevi.get('Gigel'))

# actualizarea datelor:
note_elevi['Costel'] = 7
print(note_elevi)

# aflarea dimensiunii:
print(len(note_elevi))

# stergerea valorilor:
note_elevi.pop('Gigel')
print(note_elevi)

# mesaj default daca nu gaseste valoarea:
print(note_elevi.get('Gigel','nu gasesc aceasta valoare pentru afisare'))
print(note_elevi.pop('Gigel','nu gasesc aceasta valoare pentru stergere'))

# returnarea cheilor unui dict:
print(note_elevi.keys())
