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

# for i criado para percorrer a lista numeros nvertida até o penúltimo elemento. Em cada iteração, é verificado se uma subsequência de 6 números consecutivos é igual à sequência de sorteio.


for i in range(len(numeros) - 5):
    if tuple(numeros[i:i+6]) == sorteio_tupla:
        ocorrencias_ordem_inversa += 1
        print("Sequência encontrada na posição", i)




# Essas linhas imprimem o número de ocorrências da sequência na ordem direta e na ordem inversa, respectivamente.

print("Número de ocorrências na ordem direta:", ocorrencias_ordem_direta)
print("Número de ocorrências na ordem inversa:", ocorrencias_ordem_inversa)

