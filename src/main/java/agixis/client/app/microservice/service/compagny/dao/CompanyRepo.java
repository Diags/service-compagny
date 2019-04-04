package agixis.client.app.microservice.service.compagny.dao;

import agixis.client.app.microservice.service.compagny.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// cette annotation permet d'exposer le web service
@RepositoryRestResource
public interface CompanyRepo extends JpaRepository<Company, Long> {
}
