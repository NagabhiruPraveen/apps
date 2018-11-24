package com.cg.saturday.dao;

import java.util.List;

import com.cg.saturday.dto.Doctor;

public interface IDoctorDao {

	int addDoctorData(Doctor doc);

	List<Doctor> showAllDoctors();

	void deleteDoctor(int id);

	void updateDoctor(Doctor doc);

	Doctor searchDoctor(int id);

}
