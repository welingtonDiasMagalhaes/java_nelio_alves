package _11_dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class _03_ConvertendoDataHoraGlobalParaLocal {

	public static void main(String[] args) {
		//para converter Data Hora Global Para Local precisa fornecer o timezone!
		
		//lista dos time zones disponíveis
		/*
		 * for (String s : ZoneId.getAvailableZoneIds()) System.out.println(s);
		 */
		
		//convertendo o instante para hora local sem especificar timezone (LocalDate)
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println(d06); //2022-07-20T01:30:26Z
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //converte para o timeZone da maquina
		System.out.println(r1); //2022-07-19
		
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //converte para o timeZone de portugal
		System.out.println(r2); //2022-07-20
		
		System.out.println();
		
		//convertendo o instante para hora local com timezone (LocalDateTime)
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d05); //2022-07-20T01:30:26
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		System.out.println(r3); //2022-07-19T22:30:26
		
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(r4); //2022-07-20T02:30:26
		
		System.out.println();
		
		//obter dados de uma hora local
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04); //2022-07-20
		System.out.println("d04 dia = " + d04.getDayOfMonth()); //d04 dia = 20
		System.out.println("d04 mês = " + d04.getMonthValue()); //d04 mês = 7
		System.out.println("d04 ano = " + d04.getYear()); //d04 ano = 2022

		//localDateTime tem hora e minuto
		LocalDateTime d07 = LocalDateTime.parse("2022-11-23T02:30:26");
		System.out.println(d07); //2022-11-23T02:30:26
		System.out.println("d07 hora = " + d07.getHour());   //d07 hora = 2
		System.out.println("d07 minutos = " + d07.getMinute()); //d07 minutos = 30
	}
}
