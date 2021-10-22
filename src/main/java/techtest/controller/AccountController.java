package techtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import techtest.domain.Accounts;
import techtest.request.HttpHeaderFactory;

@RestController
public class AccountController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/account/{currency}")
    public Accounts getBalance(@RequestHeader("Authorization") String token,
                               @PathVariable("currency") String currency) {
        var url = "https://test.deribit.com/api/v2/private/get_account_summary"
                + "?currency="+currency;

        var httpEntity = new HttpEntity<>(HttpHeaderFactory.create(token));

        try {
            var accounts = restTemplate.exchange(url, HttpMethod.GET, httpEntity, Accounts.class).getBody();
            accounts.getResult().updateReserved();
            return accounts;
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            throw new ResponseStatusException(
                    e.getStatusCode(), e.getMessage(), e);
        }
    }
}
