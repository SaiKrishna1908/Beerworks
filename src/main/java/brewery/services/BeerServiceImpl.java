package brewery.services;

import brewery.web.model.BeerDto;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getRandomBeer() {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Random Beer").beerStyle("Random Beer Style")
            .build();
    }
}
