"""
Operatori:
- aritmetici: +; -; *; /; % (modulo = restul unei impartiri);
- de comparare: <; >; ==; !=; >=; <=;
- logici: and; or; ! (not = inversa);
"""

a = 5
b = 7

print(a + b)    # 5 + 7 = 12
print(a - b)    # 5 - 7 = -2
print(a * b)    # 5 * 7 = 35
print(a / b)    # 5 / 7 = 0     (Python face calculul corect, cu zecimale)
print(b % a)    # 7 % 5 = 2

print(f'a ({a}) egal cu b ({b})? => ',a == b)   # => False
print(f'a ({a}) diferit de b ({b})? => ',a != b)   # => True
print(f'a ({a}) mai mare decat b ({b})? => ',a > b)   # => False
print(f'a ({a}) mai mic decat b ({b})? => ',a < b)   # => True
print(f'a ({a}) mai mic sau egal cu b ({b})? => ',a <= b)   # => True
print(f'a ({a}) mai mare sau egal cu b ({b})? => ',a >= b)   # => False
a = b
print(f'a ({a}) mai mare sau egal cu b ({b})? => ',a >= b)   # => True
a = 5
print(f'a ({a}) mai mic decat b ({b}) SI a mai mic decat 4? => ',a < b and a < 4)   # => False
print(f'a ({a}) mai mic decat b ({b}) SI a mai mic decat 12? => ',a < b and a < 12)   # => True
print(f'a ({a}) mai mic decat b ({b}) SAU a mai mic decat 4? => ',a < b or a < 4)   # => True
