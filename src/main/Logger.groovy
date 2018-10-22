package main
import java.text.SimpleDateFormat

class Logger
{
	public static void log(String message)
	{
		def date = new Date()
		def sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
		def now = "[${sdf.format(date)}]:"
		
		println("$now $message")
	}
}
