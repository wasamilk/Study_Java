package ch08_Dao_demo.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch08_Dao_demo.domain.userinfo.UserInfo;
import ch08_Dao_demo.domain.userinfo.dao.UserInfoDao;
import ch08_Dao_demo.domain.userinfo.dao.mysql.UserinfoMysqlDao;
import ch08_Dao_demo.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserinfoClient {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		// Properties객체 : key,value쌍으로 정보를 읽어들이는 객체..
		Properties prop = new Properties();
		prop.load(fis);
		// 읽어들인 정보에서 DBTYPE의 value값 구해옴
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("wb");
		userInfo.setPassword("1234");
		userInfo.setUsername("woobin");
		UserInfoDao userInfoDao = null;
		
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		}else if(dbType.equals("MYSQL")){
			userInfoDao = new UserinfoMysqlDao();
		}else {
			System.out.println("db error");
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}
}
