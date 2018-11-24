package com.cg.saturday.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.saturday.dao.IDoctorDao;
import com.cg.saturday.dto.Doctor;
@Service("doctorservice")
@Transactional
public class DoctorServiceImpl implements IDoctorService {
@Autowired
	IDoctorDao dao;
	@Override
	public int addDoctorData(Doctor doc) {
		// TODO Auto-generated method stub
		return dao.addDoctorData(doc);
	}
	@Override
	public List<Doctor> showAllDoctors() {
		// TODO Auto-generated method stub
		return dao.showAllDoctors();
	}
	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		dao.deleteDoctor(id);
	}
	@Override
	public void updateDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		dao.updateDoctor(doc);
	}
	@Override
	public Doctor searchDoctor(int id) {
		// TODO Auto-generated method stub
		return dao.searchDoctor(id);
	}

}
