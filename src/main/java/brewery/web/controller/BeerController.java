package brewery.web.controller;

import brewery.services.BeerService;
import brewery.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/beer/")
@RestController
@RequiredArgsConstructor
public class BeerController {

    private final BeerService beerService;

    @GetMapping("random")
    ResponseEntity<BeerDto> getRandomBeer(){
        return new ResponseEntity<BeerDto>(beerService.getRandomBeer(), HttpStatus.OK);
    }
}
