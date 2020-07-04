package com.mashang.useraccount.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.mashang.useraccount.domain.UserAccount;

public interface UserAccountRepo extends JpaRepository<UserAccount, String>, JpaSpecificationExecutor<UserAccount> {

	UserAccount findByIdAndDeletedFlagIsFalse(String id);
	
	UserAccount findByUserNameAndDeletedFlagIsFalse(String userName);

}
