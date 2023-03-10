package _11_dataHora;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class _05_Date_ateJava7 {

	public static void main(String[] args) throws ParseException {
		/*
		 * Até java 7
		 * Date
		 * Representa um INSTANTE
			Pacote java.util
			https://docs.oracle.com/javase/10/docs/api/java/util/Date.html
			Um objeto Date internamente armazena:
			• O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT (UTC)
			• GMT: Greenwich Mean Time (time zone)
			• UTC: Coordinated Universal Time (time standard)
			
			SimpleDateFormat
			• https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html
			• Define formatos para conversão entre Date e String
			• dd/MM/yyyy -> 23/07/2018
			• dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07
			
			Padrão ISO 8601 e classe Instant
			• Formato: yyyy-MM-ddTHH:mm:ssZ -> Z: UTC
			• Exemplo: "2018-06-25T15:42:07Z"
			
			ISO 8601 -> Date
			• Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 */
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); //data com horário atual
		Date x2 = new Date(System.currentTimeMillis()); //data com horário atual
		Date x3 = new Date(0L); //passando os milisegundos. no caso será  1 de janeiro de 1970 GMT (UTC) - 3 devido ao UTC
		Date x4 = new Date(1000L * 60L * 60L * 5L); // 5horas de 1 janeiro 1970. No brasil 3 horas atás devido ao UTC
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //data padrão ISO 8601 UTC
		
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("-------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

	}

}
