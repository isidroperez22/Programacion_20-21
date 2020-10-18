Proceso Ej2
	Definir  res, resto  Como Real
	definir n Como Entero 
	Escribir "Escribe un numero"
	leer n 
	res = 0
	resto = 0
	Mientras n > 0 Hacer
		resto = n % 10
		res = res * 10 + resto 
		n = trunc(n / 10)
		Escribir res
		Escribir n
	FinMientras
	Escribir res
FinProceso
