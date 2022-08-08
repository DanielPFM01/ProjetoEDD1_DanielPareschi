# ProjetoEDD1_DanielPareschi
Problema: Conta de Banco

Trata-se de um sistema de contas de banco, podendo depositar, sacar e com serviço de atendimento online, sendo uma fila de prioridade. Uma conta de banco tem um número de conta, saldo, prioridade e dono. 
O dono possui nome e ano de nascimento. Uma conta só pode ser criada se o dono tiver mais de 18 anos, e a prioridade da conta é definida pelo ano de nascimento de seu dono. Se seu dono tem mais de 65 anos, ele tem prioridade 1. Se não, tem prioridade 2. Quanto menor o número de prioridade, maior ela é e mais rápido o dono da conta será atendido na fila.
Contas diferentes não podem ter um mesmo número de conta, e um saque só pode ser realizado se o valor do saque for menor que o valor do saldo da conta. 
Contas e pessoas são associadas por um grafo.

