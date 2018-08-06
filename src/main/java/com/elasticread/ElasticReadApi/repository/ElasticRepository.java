package com.elasticread.ElasticReadApi.repository;

import com.elasticread.ElasticReadApi.domain.Title;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticRepository extends ElasticsearchRepository<Title, String> {
}
