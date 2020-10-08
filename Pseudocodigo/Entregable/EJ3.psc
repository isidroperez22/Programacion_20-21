Proceso EJ3 
	Definir n, i Como Entero
	Escribir Sin Saltar "Por favor, introduzca la altura (número impar mayor o igual a 5): "
	leer n
	Mientras n <= 5 o n % 2 = 0
		leer n
	FinMientras
	para i = 1 Hasta n Hacer
			si i = 1 o i = redon(n / 2)  o i = n entonces
				escribir Sin Saltar "MMMMMM"
			SiNo
				Escribir Sin Saltar "M    M"
			FinSi
		Escribir ""
	FinPara
	
FinProceso
