package com.itcast.shiro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class RoleTest {
	/*static{
		System.out.println("static");
	}*/
  @Test
	public void testHasRoles(){
    	Subject currentUser=ShiroUtil.login("classpath:shiro_role.ini", "java123", "123456");
        System.out.println(currentUser.hasRole("role1")?"有role1角色":"没有role1角色");
        System.out.println(currentUser.isPermitted("add")?"有add权限":"没有add权限");
        
        
        
        List<HashMap<String,Object>> lists= new ArrayList<HashMap<String,Object>>();
        HashMap<String,Object> map=new HashMap<String,Object>();
        HashMap<String,Object> hmap=new HashMap<String,Object>();
        map.put("name", "zhangsan");
        map.put("sex","男");
        map.put("age", 23);
        lists.add(map);
        for (Map.Entry<String, Object> arg : map.entrySet()) {
			System.out.println(arg.getKey()+":"+arg.getValue());
		}
        System.out.println("22222222222222222");
        for (HashMap<String, Object> hashMap : lists) {
        	 for (String k : hashMap.keySet())
             {
        		 hmap.put(k, hashMap.get(k));
             //  System.out.println(k + " : " + hashMap.get(k));
             }
		}
        System.out.println("***********************");
        for (Map.Entry<String, Object> arg1 : hmap.entrySet()) {
			System.out.println(arg1.getKey()+":"+arg1.getValue());
		}
	}
  
    public RoleTest(){
    	 EncodeUtil util=new EncodeUtil();
    	
    	List<HashMap<String,Object>> lists= new ArrayList<HashMap<String,Object>>();
        HashMap<String,Object> map=new HashMap<String,Object>();
        HashMap<String,Object> hmap=new HashMap<String,Object>();
        map.put("name", "zhangsan");
        map.put("sex","男");
        map.put("age", 23);
        map.put("msg", util.getMsg());
        lists.add(map);
        for (Map.Entry<String, Object> arg : map.entrySet()) {
			System.out.println(arg.getKey()+":"+arg.getValue());
		}
        System.out.println("22222222222222222");
        //[{msg=EncodeUtil+++++++getMsg, sex=男, name=zhangsan, age=23}]
        for (HashMap<String, Object> hashMap : lists) {
        	 for (String k : hashMap.keySet())
             {
        		// {msg=EncodeUtil+++++++getMsg, sex=男, name=zhangsan}
        		 hmap.put(k, hashMap.get(k));
             //  System.out.println(k + " : " + hashMap.get(k));
             }
		}
        System.out.println("***********************");
        for (Map.Entry<String, Object> arg1 : hmap.entrySet()) {
			System.out.println(arg1.getKey()+":"+arg1.getValue());
		}
       
	}
    
    public static void main(String[] args) {
    	new RoleTest();
		System.out.println("1212121212");
	}

	
}
