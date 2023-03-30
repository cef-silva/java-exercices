package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
	
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now(); // Data atual
		LocalDateTime d02 = LocalDateTime.now(); // Data-hora atual
		Instant d03 = Instant.now(); // Data-hora no fuso de Londres 
		
		LocalDate d04 = LocalDate.parse("2022-07-20"); // Texto ISO 8601 virando data
		LocalDateTime d05 = LocalDateTime.parse("2022-07-10T01:30:26"); // Texto ISO 8601 virando data e hora
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // Texto ISO 8601 no fuso horario de Londres
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // Texto ISO 8601 no fuso horario de SP
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // Data normal convertida em ISO
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); // Data e hora normais convertidas em ISO
		
		LocalDate d10 = LocalDate.of(2022, 7, 20); // Transforma ano, mes e dia separados em data ISO
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30); // Instancia ano, mes, dia e hora em data ISO
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
	}

}
