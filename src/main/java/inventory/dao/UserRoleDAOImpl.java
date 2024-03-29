package inventory.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import inventory.model.UserRole;

@Repository
@Transactional(rollbackFor = Exception.class)
public class UserRoleDAOImpl extends BaseDAOImpl<UserRole> implements UserRoleDAO<UserRole> {

}
