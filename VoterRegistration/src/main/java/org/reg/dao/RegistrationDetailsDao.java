package org.reg.dao;

import org.reg.bean.VoterDetails;

public interface RegistrationDetailsDao {
	public void insertVoterDetails(VoterDetails voterDetails);
	public void updateVoterDetails(VoterDetails voterDetails);
	public void deleteVoterDetails(VoterDetails voterDetails);

}
