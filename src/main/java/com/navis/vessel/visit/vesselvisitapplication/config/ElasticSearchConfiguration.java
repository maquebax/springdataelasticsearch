package com.navis.vessel.visit.vesselvisitapplication.config;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * ElasticSearch configuration
 *
 * @author sridhvi
 *
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.navis.vessel.visit.vesselvisitapplication.repo")
@ComponentScan(basePackages = { "com.navis.vessel.visit.vesselvisitapplication.service" })
public class ElasticSearchConfiguration {

    @Value("${elasticsearch.home}")
    private String elasticsearchHome;

    @Value("${elasticsearch.cluster.name}")
    private String clusterName;

    @Value("${elasticsearch.host}")
    private String esHost;

    @Value("${elasticsearch.port}")
    private int esPort;
    @Bean
    public Client client()  {
        TransportClient client = null;
        try {
            Settings elasticsearchSettings = Settings.builder()
                    .put("client.transport.sniff", true)
                    .put("path.home", elasticsearchHome)
                    .put("cluster.name", clusterName).build();
            client = new PreBuiltTransportClient(elasticsearchSettings);
            client.addTransportAddress(new TransportAddress(InetAddress.getByName(esHost), esPort));
        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    return client;
    }

   @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(client());
    }

}
