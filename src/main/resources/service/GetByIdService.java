package service;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;
import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Account;

public class GetByIdService implements Callable {
    
    @Override
    public Object onCall(MuleEventContext eventContext) throws Exception {
        String payload = eventContext.getMessage().getPayloadAsString();
        ObjectMapper mapper = new ObjectMapper();
        
        return mapper.readValue(payload, Account.class);
    }
}