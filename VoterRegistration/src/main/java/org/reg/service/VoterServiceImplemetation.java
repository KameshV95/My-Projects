package org.reg.service;

import org.reg.bean.VoterDetails;
import org.reg.dao.RegistrationDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("voterService")
public class VoterServiceImplemetation implements VoterService {
	@Autowired
	RegistrationDetailsDao registrationDetailsDao;
	public void insertVoterDetails(VoterDetails voterDetails) {
		registrationDetailsDao.insertVoterDetails(voterDetails);
		
	}

}
