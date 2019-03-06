package com.pyh.shiro;

import java.util.ArrayList;
import java.util.List;

public class MyCode {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
      	list.add("张三");
    	list.add("张三");
    	list.add("张三");
    	list.add("张三");
    	list.add("李四");
    	list.add("李四");
    	list.add("李四");
    	list.add("李四");
    	
    	list.add("李四");
    	list.add("李四");
    	
  	System.out.println(list);
  	
  
   
     List newList = new  ArrayList(); 
     for (String cd:list) {
        if(!newList.contains(cd)){
            newList.add(cd);
        }
    }
     System.out.println( "去重后的集合： " + newList); 
  }
	}




