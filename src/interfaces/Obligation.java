package interfaces;

import java.util.List;

/*
 * TypeOfObject es solamente para que sea generico
 */
public interface Obligation <TypeOfObject>{
	public boolean create(TypeOfObject T);
	public boolean delete(Object key); // borra con la primary key
	public boolean update(TypeOfObject T);
	
	public TypeOfObject read(Object key);
	public List<TypeOfObject> readAll();
}
