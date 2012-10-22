package org.flowers.ejb;

import java.util.List;

import javax.ejb.Stateless;

import org.flowers.entity.Flower;

@Stateless
public interface FlowerService {

	List<Flower> loadFlowers();

}
