package com.mytest.myproject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.mytest.myproject.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
