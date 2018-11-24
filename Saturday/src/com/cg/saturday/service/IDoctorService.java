package com.cg.saturday.service;

import java.util.List;

import com.cg.saturday.dto.Doctor;

public interface IDoctorService {

	public int addDoctorData(Doctor doc);

	public List<Doctor> showAllDoctors();

	public void deleteDoctor(int id);

	public void updateDoctor(Doctor doc);

	public Doctor searchDoctor(int id);
}
