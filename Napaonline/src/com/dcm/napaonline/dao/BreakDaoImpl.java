package com.dcm.napaonline.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dcm.napaonline.model.Break;

@Repository
public class BreakDaoImpl implements BreakDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void indexBreaks() throws Exception {
		try {
			Session session = sessionFactory.getCurrentSession();
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			fullTextSession.createIndexer().startAndWait();
		} catch (Exception e) {
			throw e;
		}

	}

	@Override
	public void addBreaks(Break breaks) {
		/*Session session = sessionFactory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(breaks);
		tx.commit();
*/
		hibernateTemplate.save(breaks);
	}

	@Override
	public List<Break> searchForBreak(String text) throws Exception {
		try {
			Session session = sessionFactory.getCurrentSession();
			FullTextSession fullTextSession = Search.getFullTextSession(session);
			QueryBuilder qb = fullTextSession.getSearchFactory().buildQueryBuilder().forEntity(Break.class).get();
			org.apache.lucene.search.Query query = qb.keyword().onFields("part", "description", "price").matching(text)
					.createQuery();
			org.hibernate.Query hibQuery = fullTextSession.createFullTextQuery(query, Break.class);
			List<Break> list = hibQuery.list();
			return list;
		} catch (Exception e) {
			throw e;
		}
	}

}
