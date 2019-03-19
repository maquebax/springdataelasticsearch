
Setup

1) To retrieve Hardcoded values of vesselvisit 
     <br>set "spring.profiles.active=default" in application.properties</br>   

2) To retrieve vessel visit from ElasticSearch set the following in application.properties
     
     <br>spring.profiles.active=elasticsearch</br>
     <br>elasticsearch.host=127.0.0.1</br>
     <br>elasticsearch.port=9300</br>
     <br>elasticsearch.home=C:\Users\sridhvi\Desktop\elasticsearch-6.3.2</br>
     <br>elasticsearch.cluster.name:ESprod</br>
        
     

for finding the values of above properties for elastic search ,hit
http://127.0.0.1:9200/_nodes/settings?pretty=true

Info:
This project is an intial trial of Spring Data elastic-search

The use case here is to connect the VesselVisitApp to either a no sql database or elastic-search for retreiving vesselvisit objects.
The solution here is to use spring-data-elasticsearch as it simply extends over spring data




References 

https://docs.spring.io/spring-data/elasticsearch/docs/current/reference/html/#repositories.custom-implementations

https://github.com/spring-projects/spring-data-elasticsearch/blob/master/README.md

https://www.baeldung.com/spring-data-elasticsearch-tutorial

https://docs.spring.io/spring-data/rest/docs/current/reference/html/

https://github.com/spring-projects/spring-data-elasticsearch/wiki/Spring-Data-Elasticsearch---Spring-Boot---version-matrix

https://jira.spring.io/browse/DATAES-339?jql=text%20~%20%22NoNodeAvailableException%22

https://www.elastic.co/guide/en/elasticsearch/client/java-api/current/transport-client.html