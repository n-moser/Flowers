package org.flowers.ejb;

import java.util.List;

import org.flowers.entity.Flower;

public interface FlowerService {

	List<Flower> loadFlowers();

}
