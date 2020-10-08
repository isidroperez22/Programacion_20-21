Proceso Ej1
	definir n Como entero
	Escribir "Cuantas unidades quieres: "
	leer n
	si n <= 100 Entonces
		Escribir Sin Saltar "El precio del pedido es: " n * 5.23
	SiNo
		si n >= 101 o n <= 1000 Entonces
			Escribir Sin Saltar "El precio del pedido es: " (n - 100) * 4.16 + 523
		SiNo
			si n >= 1001 Entonces
				Escribir Sin Saltar "El precio del pedido es: " (n - 1000) * (5.23/2) + 4267 + 523
			FinSi
		FinSi
	FinSi
FinProceso
