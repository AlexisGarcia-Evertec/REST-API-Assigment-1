/**
 * @author alexis
 * @email Alexis.Garcia@evertecinc.com
 * @day 19/04/2019
 * @version 1.0
 */

/*
 * REST API Class with four HTTP methods or verbs (GET, POST, PUT, DELETE)
 */
package evertec.rest.main.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import evertec.rest.main.models.Mensaje;

@RestController
public class RestAPI {
	
	/*
	 * use the following objects
	 * ArrayList<T> here you have to think what each method should return. T is the class of type to return.
	 */
	//private static ArrayList<T> listaDeMensajes = new ArrayList<T>();
	//private static Mensaje mensaje = new Mensaje();
	
	@GetMapping(value="/greeting{elementIndex}")
	public ResponseEntity<Mensaje> getNames() {
		/*
		 * GET is only used to retrieve data. Specify which message you want to extract from listaDeMensajes ArrayList<>. 
		 *
		 *
		 *
		 * You should return message by elementIndex inside listaDeMensajes ArrayList<>
		 * if no message is found. Return only HTTP status code and no customed HTTP message.
		 *
		 *
		 *
		 *
		 */
	return null;
	}
	
	@PostMapping(value="/greeting/{message}")
	public ResponseEntity<String> createNames() {
		/*
		 * POST is used to create new resource (data)
		 *
		 *
		 *
		 * You should capture the URI template variable message value and inserted 
		 * inside de listaDeMensajes ArrayList<>. Duplicated messages are not permitted.
		 *
		 *
		 *
		 *
		 */
	return null;
	}
	
	@PutMapping(value="/greeting/{message}")
	public ResponseEntity<String> updateName() {
		/*
		 * PUT is used to update existing resource (data)
		 * 
		 * 
		 * 
		 * You should update existing messages inside listaDeMensajes ArrayList<>.
		 * if message does not exist, return HTTP status code with a customed HTTP message.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	return null;
	}
	
	@DeleteMapping(value="/greeting/{byMessageElementIndex}")
	public ResponseEntity<String> removeName() {
		/*
		 * DELETE is used to remove a resource (data)
		 * 
		 * 
		 * 
		 * You should update existing messages inside listaDeMensajes ArrayList<>.
		 * if message (resource) is not available, it does not exist, return correct HTTP message.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	return null;
	
	}

}
