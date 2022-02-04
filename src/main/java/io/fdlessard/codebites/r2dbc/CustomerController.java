package io.fdlessard.codebites.r2dbc;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping
    public Flux<Customer> getAll() {
        return customerRepository.findAll();
    }

    @GetMapping(value = "/{name}")
    public Mono<Customer> getOne(@PathVariable String name) {
        return customerRepository.findByLastName(name);
    }
}
