package techtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
import techtest.domain.Deposits;
import techtest.domain.Withdrawals;
import techtest.request.HttpHeaderFactory;

@RestController
public class WithdrawalController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/account/{currency}/withdrawal")
    public Withdrawals getWithdrawals(@RequestHeader("Authorization") String token,
                                @PathVariable(name="currency") String currency,
                                @RequestParam("pagesize") int pageSize,
                                @RequestParam("offset") int offset) {
        var url = "https://test.deribit.com/api/v2/private/get_withdrawals"
                + "?count=" + pageSize
                + "&currency=" + currency
                + "&offset=" + offset;
        var httpEntity = new HttpEntity<>(HttpHeaderFactory.create(token));

        try {
            return restTemplate.exchange(url, HttpMethod.GET, httpEntity, Withdrawals.class).getBody();
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            throw new ResponseStatusException(
                    e.getStatusCode(), e.getMessage(), e);
        }
    }
}
