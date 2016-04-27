package interfaces;

import java.util.List;

/*
 * TypeOfObject es solamente para que sea generico
 */
public interface Obligation <TypeOfObject>{
	public boolean create(TypeOfObject t);
	public boolean delete(Object key); // borra con la primary key
	public boolean update(TypeOfObject t);
	
	public TypeOfObject read(Object key);
	public List<TypeOfObject> readAll();
}
