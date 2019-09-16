package org.spring.woo.admin.service;

import java.util.List;

import org.spring.woo.main.domain.Criteria;
import org.spring.woo.user.domain.UserVO;

public interface AdminService {
	//user List
		public List<UserVO> userList(Criteria cri)throws Exception;
		
		public int userListCount()throws Exception;
		
		//user update
		public void userUpdate(UserVO vo)throws Exception;
		
		//user auth ���� update
		public void authUpdate(UserVO vo)throws Exception;
		
		//user delete
		public void userDelete(String id)throws Exception;
		public UserVO userRead(String id)throws Exception;

}
