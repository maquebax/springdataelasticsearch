package com.navis.vessel.visit.vesselvisitapplication.repo;


import com.navis.vessel.visit.vesselvisitapplication.model.VesselVisit;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
/**
 * Spring Data Elastic Search Repository
 * @author sridhvi
 *
 */
public interface VesselVisitRepository extends ElasticsearchCrudRepository<VesselVisit,String> {
}
