 package com.cg.saturday.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.saturday.dto.Doctor;


@Repository("dao")
public class DoctorDaoImpl implements IDoctorDao {
	@PersistenceContext
	EntityManager em;

	@Override
	public int addDoctorData(Doctor doc) {
		em.persist(doc);
		em.flush();
		return doc.getdId();
	}

	@Override
	public List<Doctor> showAllDoctors() {
	Query query=em.createQuery("from Doctor");
	List<Doctor> myList=query.getResultList();
		for (Doctor doctor : myList) {
			System.out.println(doctor);
		}
		return myList;
	}

	@Override
	public void deleteDoctor(int id) {

		Query query=em.createQuery("delete from Doctor where dId=:did");
		query.setParameter("did", id);
		query.executeUpdate();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDoctor(Doctor doc) {
		em.merge(doc);
		em.flush();
		
	}

	@Override
	public Doctor searchDoctor(int id) {
		// TODO Auto-generated method stub
		Doctor doc=null;
		doc=em.find(Doctor.class, id);
		System.out.println("dao "+doc);
		return doc;
	}

}
