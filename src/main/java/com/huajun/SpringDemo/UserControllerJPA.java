package com.huajun.SpringDemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserControllerJPA {

	
	@Autowired
	private UserRepository UserRepo;
	
	//Get all users
	@GetMapping(path="/getAllUsers")
	public List<User> getAllUsers(){

		return UserRepo.findAll();
	}
	
	//Adding a new user into the classroom
	@PostMapping(path="/addNewUser")
	public ResponseEntity addNewUser(@RequestBody User newUser){
		UserRepo.save(newUser);
		return new ResponseEntity<>("Created new user",HttpStatus.CREATED);
	}
	//Update user's email address by id
	@PutMapping(path="/updateEmail/{id}")
	public ResponseEntity changePassword(String email, @PathVariable Long id) {
		if (UserRepo.findById(id).isPresent()){
			Optional<User> user = UserRepo.findById(id);
			user.get().setEmail(email);
		}
		return new ResponseEntity<>("Email updated",HttpStatus.ACCEPTED);
	}
	//Delete user by id
	@DeleteMapping(path="/deleteUser/{id}")
	public ResponseEntity deleteUser(@PathVariable Long id) {
		UserRepo.deleteById(id);
		return new ResponseEntity<>("User : " + id + " deleted",HttpStatus.ACCEPTED);
	}
	
}
