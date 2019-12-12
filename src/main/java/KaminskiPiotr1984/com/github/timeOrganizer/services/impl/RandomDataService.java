package KaminskiPiotr1984.com.github.timeOrganizer.services.impl;


import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.RandomData;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories.RandomRepository;
import KaminskiPiotr1984.com.github.timeOrganizer.dtos.RandomDataCreateDTO;
import KaminskiPiotr1984.com.github.timeOrganizer.services.CreateRandomDataService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RandomDataService implements CreateRandomDataService {

    private final RandomRepository randomRepository;


    public RandomDataService(RandomRepository randomRepository) {
       this.randomRepository = randomRepository;
    }


@Override
   public void createRandomData(RandomDataCreateDTO randomDataCreate) {
    ModelMapper mapper = new ModelMapper();
    RandomData randomData = mapper.map(randomDataCreate, RandomData.class);

    randomRepository.save(randomData);
}




}
