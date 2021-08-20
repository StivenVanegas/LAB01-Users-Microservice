package edu.eci.UserMicroservice.service;

import edu.eci.UserMicroservice.data.User;
import java.util.List;

/**
 *
 * @author StivenVanegas
 */
public interface UserService {
    
    User create(User user);

    User findById(String id);

    List<User> all();

    Boolean deleteById(String id);

    User update(User user, String userId);
    
}
