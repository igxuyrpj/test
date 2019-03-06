import org.junit.Test;

public class MyX {
	public static void main(String[] args) {
		/*int day = 24 * 60 * 60;
		int h = 60 * 60;
		user.setUseTime(useData / h / 24+"day"+useData / h % 24 + "h" + useData / h / 24 % (60 * 1000) + "min");
		System.out.println(91560/h/ 24+"day"+91560 / h % 24 + "h" + 91560 / h / 24 % (60 * 1000) + "min");
		System.out.println(91560 / h );
		System.out.println(91560 / h/24+"".lastIndexOf(".") );
		System.out.println(91560 / h/24+"".substring(91560 / h/24+"".lastIndexOf(".")));*/
	 
		long timeTemp = System.currentTimeMillis();
		  long time = 91596000;
		 
		  time /= 1000;
		  long year = time/(365*24*3600);
		  time = time%(365*24*3600);
		  long month = time/(30*24*3600);
		  time = time % (30*24*3600);
		  
		  long day = time/(24*3600);
		  time = time % (24*3600);
		  long hour = time/3600;
		  
		  time = time % 3600;
		  long min = time/60;
		  
		  time = time % 60;
		  long sec = time;
		  System.out.println(year+"年"+month+"月"+day+"天"+hour+"小时"+min+"分钟"+sec+"秒零");
		 
	System.out.println(91560/(24*3600)+"天"+91560%(24*3600)/3600+"小时"+91560%(24*3600)%3600/60+"分钟");
	}
	@Test
	public void test1(){
		
		int day = 24 * 60 * 60 * 1000;
		int h = 60 * 60 * 1000;
		System.out.println(560000 /day+"day"+560000 %day /h + "h" + 560000% day % h / (60 * 1000) + "min");
	}
	}


