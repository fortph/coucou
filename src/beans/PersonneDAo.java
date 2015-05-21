package beans;

import java.util.ArrayList;
import java.util.List;

import dao.exception.DAOException;
import dao.interfaces.DAO;

public class PersonneDAo implements DAO<Personne> {
	
	private List<Personne> liste=new ArrayList<Personne>();
	private Personne a=new Personne("fort","philippe");
	private Personne b=new Personne("martin","eric");
	private Personne c=new Personne("zanin","daniel");
	private Personne d=new Personne("dupont","alain");
	private Personne e=new Personne("fort","elodie");
	private Personne f=new Personne("jean","jaques");
	
	
	

	public PersonneDAo() {
		super();
		liste.add(a);
		liste.add(b);
		liste.add(c);
		liste.add(d);
		liste.add(e);
		liste.add(f);
	}

	@Override
	public Personne findByID(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findAll() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personne> findByCriteria(Personne obj) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int create(Personne obj) throws DAOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Personne update(Personne obj) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Personne obj) throws DAOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(long id) throws DAOException {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Personne> getListe() {
		return liste;
	}

	public void setListe(List<Personne> liste) {
		this.liste = liste;
	}
	
	

}
