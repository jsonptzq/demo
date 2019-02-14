package cn.itcast.action;

/**
 * 普通方式
 */
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class UserAction extends ActionSupport implements 

ModelDriven<User> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 封装数据
	private User user = new User();
	public User getModel() {
		return this.user;
	}
	// *****************************
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String add() {
		this.userService.saveUser(user);
		return "add";
	}
}

