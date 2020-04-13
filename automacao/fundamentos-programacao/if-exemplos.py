# Vamos ver se um numero é par...
num = 10

# Se o resto da divisão por 2 for zero

if num % 2 == 0: 	
    print('Esse número é par')

if not (1 >= 99):
    print('1 < 99')

# Testando com o operador and
if True and True:
    print('True and True')
if True and False:
    print('True and False')
if False and True:
    print('False and True')
if False and False:
    print('False and False')

# Testando com o operador or
if True or True:
    print('True or True')
if True or False:
    print('True or False')
if False or True:
    print('False or True')
if False or False:
    print('False or False')

# Testando com operadores lógicos
if True and not (False or not True):
    print('True and True')

# Jogo da divinhação
num_secreto = 288**3 / 987 - 999 + 3
num = int(input('Adivinhe o número: '))
if num == num_secreto:
    print('Você acertou o número secreto!')
if num > num_secreto:
    print('O número secreto é menor!')
if num < num_secreto:
    print('O número secreto é maior!')

# Vamos ver se um numero é par e positivo:
num = 10
if num % 2 == 0:
    if num > 0:
        print('O número é par e positivo')
