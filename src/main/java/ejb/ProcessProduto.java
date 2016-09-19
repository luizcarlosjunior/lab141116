package ejb;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import model.Produto;
import persistencia.HibernateUtil;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ProcessProduto {


	public String create(Produto p){
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.persist(p);
        session.getTransaction().commit();
        session.close();
        return "O Produto '" + p.toString() + "' foi cadastrado co sucesso!";
	}

	public String read(Long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria criteria = session.createCriteria(Produto.class);
        criteria.add(Restrictions.idEq(id));
        java.util.List result = criteria.list();
        session.close();

        if(result.size() > 0){
        	Produto p = (Produto) result.get(0);
        	return p.toString();
        }else{
        	return "Nenhum produto foi encontrado.";
        }
	}

	public String update(Produto p){
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(p);
        session.getTransaction().commit();
        session.close();
        return "O Produto '" + p.toString() + "' foi atualizado com sucesso.";
	}

	public String delete(Long id){
		Produto p = new Produto();
		p.setId(id);

		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        try{
        	session.delete(p);
            session.getTransaction().commit();
            session.close();
            return "Produto apagado com sucesso";
        }catch (Exception e) {
        	session.close();
        	return "Não foi possível apagar o produto.";
        }
	}

}
