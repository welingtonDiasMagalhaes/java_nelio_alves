package _11_dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _01_InstanciandoDataHora {

	public static void main(String[] args) {
		//## instanciando o agora: now
		//agora -> data-hora
		LocalDate d01 = LocalDate.now();
		System.out.println(d01); //2022-12-30
		//println(d01) -> o java, implicitamente faz um .toString()
		
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02); //2022-12-30T18:23:22.468286400
		
		Instant d03 = Instant.now();
		System.out.println(d03); //2022-12-30T21:23:22.468286400Z instant traz o fuso horario de londres: Z
		
		//LocalDate, LocalDateTime, Instant: o .toString() converte para ISO 8601
		System.out.println("d01 = " + d01.toString()); //d01 = 2022-12-30

		//## Texto ISO 8601 -> objeto Data-hora
		//parse(Texto ISO 8601)
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04); //2022-07-20
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d05); //2022-07-20T01:30:26
		
		//especificando timezone GMT
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println(d06); //2022-07-20T01:30:26Z
		
		//especificando um timezone diferente do GMT: -03:00 menos 3 horas
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d07); //2022-07-20T04:30:26Z : time zone 01:30:26 -03:00 = 04:30
		
		
		//## Texto formato customizado ➞ Data-hora
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //especifica o formato customizado
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //faz a conversao
		System.out.println(d08); //2022-07-20
		
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");//especifica o formato customizado
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); //faz a conversao
		System.out.println(d09); //2022-07-20T01:30

		//## dia, mês, ano, [horário] ➞ Data-hora local
		LocalDate d10 = LocalDate.of(2022, 07, 23);
		System.out.println(d10); //2022-07-23
		
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 24, 1, 30);
		System.out.println(d11); //2022-07-24T01:30
		
	}

}
