package de.csausl.backend.controller;

import de.csausl.backend.models.ProductRecord;
import de.csausl.backend.repository.TestWareHouseRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/example")
public class exampleController {

    String test="sdfgkl;jsdf";
    private final TestWareHouseRepo repo;

    List<ProductRecord> products=List.of(
            new ProductRecord("1","Blabla","ist blau"),
            new ProductRecord("2","Manamana","ist badidididi"),
            new ProductRecord("3","Ribididi","ist rot")
    );

    public exampleController(TestWareHouseRepo testWareHouseRepo) {
        this.repo=testWareHouseRepo;
        repo.saveAll(products);
    }

    //@GetMapping
    //public String hellohello(){
    //    return "hello";
    //}

    @GetMapping
    public String helloExample(){
        return """
                {"greeting":"hello chris"}
                """;

        // bla bla bla
        // alter code
        // return "";
    }

}
