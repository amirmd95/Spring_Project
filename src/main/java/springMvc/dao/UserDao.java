package springMvc.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springMvc.model.User;

@Repository
public class UserDao {
	
	@Autowired
	 private HibernateTemplate hibernateTemplate;
	
	@Transactional
	//When somebody call the method annotated with @Transactional all or none of the writes on the database is executed
     public int saveUser(User user)
     {
    	int id=(Integer) this.hibernateTemplate.save(user);
    	return id;
     }
	
	 

}
