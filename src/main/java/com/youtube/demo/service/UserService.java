package com.youtube.demo.service;

import java.util.List;

import com.youtube.demo.modelo.User;

public interface UserService {
	/**
	 * Guarda un usuario
	 * 
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	/**
	 * Recupera la lista de usuarios
	 * 
	 * @return lista de usuarios
	 */
	List<User> findAll();

	/**
	 * Elimina un usuario con el id recibido
	 */
	void deleteUser(Long id);

}
