# 1342. Número de Passos para Reduzir um Número a Zero

Dado um inteiro `num`, retorne o número de passos para reduzi-lo a zero.

Em um passo, se o número atual for par, você deve dividi-lo por 2, caso contrário, você deve subtrair 1 dele.

## Exemplo 1:

> **Entrada:** num = 14
> 
> **Saída:** 6
> 
> **Explicação:**
> 
> Passo 1) 14 é par; divida por 2 e obtenha 7.
> 
> Passo 2) 7 é ímpar; subtraia 1 e obtenha 6.
> 
> Passo 3) 6 é par; divida por 2 e obtenha 3.
> 
> Passo 4) 3 é ímpar; subtraia 1 e obtenha 2.
> 
> Passo 5) 2 é par; divida por 2 e obtenha 1.
> 
> Passo 6) 1 é ímpar; subtraia 1 e obtenha 0.

## Exemplo 2:

> **Entrada:** num = 8
> 
> **Saída:** 4
> 
> **Explicação:**
> 
> Passo 1) 8 é par; divida por 2 e obtenha 4.
> 
> Passo 2) 4 é par; divida por 2 e obtenha 2.
> 
> Passo 3) 2 é par; divida por 2 e obtenha 1.
> 
> Passo 4) 1 é ímpar; subtraia 1 e obtenha 0.


## Exemplo 3:

> **Entrada:** num = 123
> 
> **Saída:** 12

**Restrições:**

- `0 <= num <= 10^6`

---

# 1342. Number of Steps to Reduce a Number to Zero

Given an integer `num`, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.

## Example 1:

> **Input:** num = 14
> 
> **Output:** 6
> 
> **Explanation:**
> 
> Step 1) 14 is even; divide by 2 and obtain 7.
> 
> Step 2) 7 is odd; subtract 1 and obtain 6.
> 
> Step 3) 6 is even; divide by 2 and obtain 3.
> 
> Step 4) 3 is odd; subtract 1 and obtain 2.
> 
> Step 5) 2 is even; divide by 2 and obtain 1.
> 
> Step 6) 1 is odd; subtract 1 and obtain 0.

## Example 2:

> **Input:** num = 8
> 
> **Output:** 4
> 
> **Explanation:**
> 
> Step 1) 8 is even; divide by 2 and obtain 4.
> 
> Step 2) 4 is even; divide by 2 and obtain 2.
> 
> Step 3) 2 is even; divide by 2 and obtain 1.
> 
> Step 4) 1 is odd; subtract 1 and obtain 0.


## Example 3:

> **Input:** num = 123
> 
> **Output:** 12

**Constraints:**

- `0 <= num <= 10^6`
