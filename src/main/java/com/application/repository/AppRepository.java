package com.application.repository;
import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.application.model.AppModel;

@Repository
public interface AppRepository extends CrudRepository<AppModel,String>  {
	public List<AppModel> findByDate(String date);

}
