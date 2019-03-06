package com.pyh.shiro;




import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

public class ShiroTest {
	@Test
	public void testShiro(){
		org.apache.shiro.mgt.SecurityManager manager= new IniSecurityManagerFactory("classpath:shiro.ini").getInstance();
		SecurityUtils.setSecurityManager(manager);
		
		Subject subject=SecurityUtils.getSubject();
		
		UsernamePasswordToken token=new UsernamePasswordToken("kh","123");
		try {
			subject.login(token);
			if(subject.hasRole("admin")){
				System.out.println(subject.getPrincipal()+"有admin权限！");
			}else{
				System.out.println(subject.getPrincipal()+"没有admin权限！");
			}
			if(subject.isPermitted("update")){
				System.out.println("有update权限");
			}else{System.out.println("没有update权限");}
			/*if(subject.isAuthenticated()){
				System.out.println("验证成功！");
			}*/
			//System.out.println(subject.getPrincipal());
		} catch (UnknownAccountException e) {
		System.out.println("该用户名不存在！");
		}  catch (IncorrectCredentialsException e) {
			System.out.println("该用户密码不正确！！");
			}  
		
		
	}

}
