package info.phuphan.springboot.exceptionhandling.bird;

import info.phuphan.springboot.exceptionhandling.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BirdService {

    @Autowired
    private BirdRepository birdRepository;

    public Bird getBirdNoException(Long birdId) throws EntityNotFoundException {
        return birdRepository.findOne(birdId);
    }

    public Bird getBird(Long birdId) throws EntityNotFoundException {
        Bird bird = birdRepository.findOne(birdId);
        if(bird == null){
            throw new EntityNotFoundException(Bird.class, "id", birdId.toString());
        }
        return bird;
    }

    public Bird createBird(Bird bird) {
        return birdRepository.save(bird);
    }
}
