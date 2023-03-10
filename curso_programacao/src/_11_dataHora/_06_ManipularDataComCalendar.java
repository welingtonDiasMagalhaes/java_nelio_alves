package _11_dataHora;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class _06_ManipularDataComCalendar {

	public static void main(String[] args) {
		//** Somando uma unidade de tempo
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("Hora base: "+sdf.format(d)); //hora com 3horas a menos devido ao UTC
		
		//instanciando o calendário
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//acrescentando tempo
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println("Hora base + 4h: "+sdf.format(d));
		
		//**Obtendo uma unidade de tempo
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf2.format(d2));
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int minutes = cal2.get(Calendar.MINUTE); //obtendo minutos
		int month = 1 + cal2.get(Calendar.MONTH); //obtendo mes. Deve acrescentar 1, pois começa com 0
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
