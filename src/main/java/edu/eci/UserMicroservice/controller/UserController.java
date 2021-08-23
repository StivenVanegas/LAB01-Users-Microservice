package edu.eci.UserMicroservice.controller;

import edu.eci.UserMicroservice.data.User;
import edu.eci.UserMicroservice.dto.UserDto;
import edu.eci.UserMicroservice.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author StivenVanegas
 */

@RestController
@RequestMapping("/v1/user")
public class UserController {
    
    private final UserService userService;
    
    public UserController(@Autowired UserService userService){
        this.userService = userService;
    }
    
    @GetMapping
    public ResponseEntity<List<User>> all() {
        return new ResponseEntity(userService.all(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable String id){
        return new ResponseEntity(userService.findById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDto userDto){
        User user = new User(userDto);
        return new ResponseEntity(userService.create(user), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> update(@RequestBody UserDto userDto, @PathVariable String id){
        User user = new User(id, userDto);
        return new ResponseEntity(userService.update(user, id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id){
        return new ResponseEntity(userService.deleteById(id),HttpStatus.OK);
    }
    
}
