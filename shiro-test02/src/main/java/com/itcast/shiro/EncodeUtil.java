package com.itcast.shiro;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.crypto.hash.Md5Hash;

public class EncodeUtil {
	public String getMsg(){
		return "EncodeUtil+++++++getMsg";
	}
	//base64加密
	public static String encBase64(String str){
		return Base64.encodeToString(str.getBytes());
	}
	
	//base64解密
	public static String decBase64(String str){
		return Base64.decodeToString(str);
	}
	public static String Md5(String str,String salt){
		
		return new Md5Hash(str,salt).toString();
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String str="12345";
		System.out.println("字符串加密效果："+EncodeUtil.encBase64(str));
		System.out.println("Md5加密:"+Md5(str, "panuhui"));
		System.out.println("字符串："+Md5(str, "panuhui"));
		System.out.println("字符串解密："+decBase64(EncodeUtil.encBase64(str)));
		System.out.println("字符串解密："+decBase64(Md5(str, "panuhui")));
	}
		
}
