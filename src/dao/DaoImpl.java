package dao;

import dao.IDao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        //se connecter a la bd pour recuperer la temperature
        System.out.println("Version base de données");
        double temp=Math.random()*40;
        return temp;
    }
}
