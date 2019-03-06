package com.pyh.shiro;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

public class TestEncode {
    @Test
	public void testEncode() throws ParseException{
    	//加密
		//System.out.println(new Md5Hash("123").toHex());
		//重新编码
		//System.out.println(new Md5Hash("123").toBase64());list{"张三","张三"，"李四"，“李四”，“王五”}

    	/*ArrayList<String> list = new ArrayList<String>();
      	list.add("张三");
    	list.add("张三");
    	list.add("张三");
    	list.add("张三");
    	list.add("李四");
    	list.add("李四");
    	list.add("李四");
    	list.add("李四");
  	System.out.println(list);
    	
  	for (String cd:list) {
        if(list.contains(cd)){
            list.remove(cd);
        }
    }
     System.out.println( "去重后的集合： " + list); */
    	
    	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    	/*entity.setUploadTime(timestamp);*/
		 SimpleDateFormat time =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		// Date date = new Date();       
		 /*java.sql.Date date1 = new java.sql.Date(date.getTime()); */  
		 String d=time.format(timestamp);
		 System.out.println(time.parse(d));
}
}