package _11_dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class _02_ConvertendoDataHoraParaTexto {

	public static void main(String[] args) {
		// Formatação
		//Data-hora -> Texto ISO 8601
		LocalDate d01 = LocalDate.now();
		System.out.println(d01); //2022-12-30
		//println(d01) -> o java, implicitamente faz um .toString()
		
		//Data-hora -> Texto formato customizado Operações
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		//.format() como quer apresentar a string
		LocalDate d04 = LocalDate.parse("2022-07-20"); //instanciando uma data
		//A ordem não importa d04.format(fmt1) ou fmt1.format(d04)
		System.out.println("d04 = " + d04.format(fmt1)); //d04 = 20/07/2022
		System.out.println("d04 = " + fmt1.format(d04)); //d04 = 20/07/2022
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //d04 = 20/07/2022
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //instanciando data hora
		System.out.println("d05 = " + d05.format(fmt1)); //d05 = 20/07/2022
		System.out.println("d05 = " + d05.format(fmt2)); //d05 = 20/07/2022 01:30
		System.out.println("d05 = " + d05.format(fmt4)); //d05 = 2022-07-20T01:30:26

		//instante precisa que seja especificado o fuzo horario, também no dateTimeformater, se não quebra
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //instanciando data hora com timezone
		System.out.println("d06 = " + fmt3.format(d06)); //d06 = 19/07/2022 22:30 -> colocou no horário local devido ao fmt3
		System.out.println("d06 = " + fmt5.format(d06)); //d06 = 2022-07-20T01:30:26Z
		System.out.println("d06 = " + d06.toString()); //d06 = 2022-07-20T01:30:26Z
	}

}
