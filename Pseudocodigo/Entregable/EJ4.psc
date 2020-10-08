Proceso EJ4
	Definir n, primos, maximo, minimo, cont  Como Entero 
	Definir media Como Real
	primos = 0
	media = 0
	cont = 0
	leer n
	minimo = n
	maximo = n
	Mientras n % 2 = 0 o n % 5 = 0 Hacer
		leer n
		si n % 2 = 0 o n % 5 = 0  Entonces
			si n > maximo  entonces 
				maximo = n
			FinSi
			si n < minimo Entonces
				minimo = n
			FinSi
			media = media + n
		FinSi
		cont = cont + 1
	Fin Mientras
	Escribir "Ha introducido " , cont , " no primos" 
	Escribir "Maximo: ", maximo
	Escribir "Minimo: ", minimo
	Escribir "Media: ", media / cont
FinProceso
