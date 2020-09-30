Proceso Tarea3_4
	definir n Como Entero
	definir x Como Entero
	Escribir "Escribe dos numeros"
	leer n
	leer x
	
	si n > 0 y x > 0 Entonces
		escribir "los dos son positivos"
		
	SiNo
		si (n > 0 y x < 0) o (n < 0 y x > 0) Entonces
			escribir "Solo uno es positivo"
		FinSi
	FinSi
FinProceso
