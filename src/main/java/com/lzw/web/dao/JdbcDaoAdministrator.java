package com.lzw.web.dao;

import java.util.List;

import com.lzw.web.meta.Merchandise;
import com.lzw.web.meta.Trx;
import com.lzw.web.meta.User;

public interface JdbcDaoAdministrator {

	public boolean isUserName(String username);
	
	public boolean isUserPassword(String password);
	
	public boolean deleteGoodsById(int id);
	
	public boolean deleteUserId(int id);
	
	public List<User> getUserInfoByUserName();  //��ѯ�û���Ϣ  ��д
	
	public List<Merchandise> getMerchandiseInfoById();  //��Ʒ ��
	
	public List<Trx> getTrxInfoById();  //����  ��д
	
	public void updateGoodInfo(int id,Merchandise m);   //��д
	
	public void updateUserInfo(int id,User u);   //��д
	
}
