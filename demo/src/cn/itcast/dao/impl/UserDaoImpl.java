package cn.itcast.dao.impl;

/**
 * 使用hibernate.cfg.xml文件进行整合
 */
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

public class UserDaoImpl implements UserDao {
	// 提供hibernate模板
	private HibernateTemplate hibernateTemplate;

	public User findById(Integer id) {
		return this.hibernateTemplate.get(User.class, id);
	}

	public List<User> findAll() {
		return this.hibernateTemplate.find("from User");
	}

	public void save(User user) {
		this.hibernateTemplate.save(user);
	}

	public void update(User user) {
		this.hibernateTemplate.update(user);
	}

	public void delete(User user) {
		this.hibernateTemplate.delete(user);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}