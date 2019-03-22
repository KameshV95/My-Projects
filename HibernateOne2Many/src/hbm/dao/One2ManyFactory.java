package hbm.dao;

public class One2ManyFactory {
	
	public static One2ManyDao getInstance() {
		return new One2ManyImplDao();
		
	}
}
