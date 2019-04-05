package agixis.client.app.microservice.service.compagny.ws;

import agixis.client.app.microservice.service.compagny.dao.CompanyRepo;
import agixis.client.app.microservice.service.compagny.enties.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@MessageEndpoint
public class CompanyMessageAccepter {
    @Autowired
    private CompanyRepo companyRepo;

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void accept(String societeName) {
        companyRepo.save(new Company(null, societeName, null));
    }

}