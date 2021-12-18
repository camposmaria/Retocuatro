/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.usa.ciclo4.ciclo4.Repository.crud;

import co.usa.ciclo4.ciclo4.Modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.CrudMethods;
import org.springframework.stereotype.Repository;

/**
 * Clase donde se gestiona los metodos crud
 * @author Ivonne
 */
@Repository

public class UserRepository {

    @Autowired
    /**
     * Metodo para instanciar el crud
     */
    private UserCrudRepository userCrud;
    /**
     * Metodo getall para listar todos los usuarios
     * @return 
     */
    public List<User> getAll() {

        return (List<User>) userCrud.findAll();
    }
    /**
     * Metodo get para listar usuario por Id
     * @param id
     * @return 
     */
    public Optional<User>  getUserById(int id){
    
    return userCrud.findById(id);
    
    }
    /**
     * metodo save para crear un usuario
     * @param User
     * @return usuario
     */
    public User save(User User) {

        return userCrud.save(User);
    }

    /***
     * Metodo get para listar un usuario por su nombre
     * @param name
     * @return 
     */
    public Optional<User> getUserByName(String name) {

        return userCrud.findByName(name);

    }
    /**
     * Metodo get para listar usuarios por su email
     * @param email
     * @return 
     */
    public Optional<User> getUserbyEmail(String email) {

        return userCrud.findByEmail(email);

    }
    /**
     * metodo get par listar usuarios por nombre y Email
     * @param name
     * @param email
     * @return 
     */
    public List<User> getUserByNameOrEmail(String name, String email) {

        return userCrud.findByNameOrEmail(name, email);

    }
    /**
     * 
     * @param email
     * @param password
     * @return Metodo get para buscar usuarios por email y assword
     */
    public Optional<User> getUserByEmailAndPassword(String email, String password) {

        return userCrud.findByEmailAndPassword(email, password);

    }
    /**
     * metodo delete para boorrar usuarios por id
     * @param id 
     */
    public void deleteUser(Integer id){
    
        userCrud.deleteById(id);
    
    }
    /**
     * metodo para 
     * @param Identification
     * @param cellPhone
     * @param email
     * @param password
     * @param name
     * @return 
     */
    
    public List<User> getICEP(String Identification,String cellPhone, String email, String password, String name){
    
    return userCrud.findByIdentificationAndCellPhoneAndEmailAndPasswordAndName(Identification, cellPhone, email, password, name);
    
    }
    /**
     * metodo  get para encontrar el ultimo id de los usuarios
     * @return 
     */
    public Optional <User> lastUserId(){
        return userCrud.findTopByOrderByIdDesc();
    }
    /**
     * Metodo para listar los usuarios por su mes de nacimiento
     * @param monthBirthtDay
     * @return 
     */
    public List<User> birthtDayList(String monthBirthtDay) {
        return userCrud.findByMonthBirthtDay(monthBirthtDay);
    }
}
