import random

sorteio = [1, 15, 16, 25, 32, 36]
numeros = []
ocorrencias_ordem_direta = 0
ocorrencias_ordem_inversa = 0


numeros = random.choices(range(1, 61), k=51000000)


sorteio_tupla = tuple(sorteio)


for i in range(len(numeros) - 5):
    if tuple(numeros[i:i+6]) == sorteio_tupla:
        ocorrencias_ordem_direta += 1
        print("Sequência encontrada na posição", i)


numeros.reverse()


for i in range(len(numeros) - 5):
    if tuple(numeros[i:i+6]) == sorteio_tupla:
        ocorrencias_ordem_inversa += 1
        print("Sequência encontrada na posição", i)

print("Número de ocorrências na ordem direta:", ocorrencias_ordem_direta)
print("Número de ocorrências na ordem inversa:", ocorrencias_ordem_inversa)

