Proceso Tarea8_2
	Definir x Como Entero
	Definir n Como Entero
	Escribir "Dime dos numeros"
	leer x n
	EsMultiplo(x,n)
FinProceso

Funcion EsMultiplo(x,n) 
	Si x%n = 0 o n%x = 0 Entonces
		Escribir "son multiplos"
	SiNo
		Escribir "no son multiplos"
	FinSi
FinFuncion
	