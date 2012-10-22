package org.flowers.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.flowers.entity.Flower;

@Stateless
public class FlowerServiceImpl implements FlowerServiceLocal,
		FlowerServiceRemote {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Flower> loadFlowers() {

		TypedQuery<Flower> query = this.em.createQuery(
				"select f from Flower f", Flower.class);

		return query.getResultList();
	}

}
