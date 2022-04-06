package ch08_Dao_demo.domain.userinfo.dao.mysql;

import ch08_Dao_demo.domain.userinfo.UserInfo;
import ch08_Dao_demo.domain.userinfo.dao.UserInfoDao;

public class UserinfoMysqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert into MYSQL DB userId = " + userInfo.getUserId() );		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MYSQL DB userId = " + userInfo.getUserId());		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from MYSQL DB userId = " + userInfo.getUserId());
		
	}


}