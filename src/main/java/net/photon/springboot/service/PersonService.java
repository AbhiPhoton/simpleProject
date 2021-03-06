package net.photon.springboot.service;

import net.photon.springboot.beans.PersonBean;
import net.photon.springboot.model.Person;

import java.util.List;

public interface PersonService {

    @Deprecated
    List<Person> getAllPersons();

    @Deprecated
    Person getPersonById(long id);

    boolean save(Person person);

    PersonBean getPersonBean(long id);

    List<PersonBean> getAllPersonBeans();

    List<PersonBean> getPersonBeansByName(String name);

    List<PersonBean> getPersonsByLastName(String lastName);


}
