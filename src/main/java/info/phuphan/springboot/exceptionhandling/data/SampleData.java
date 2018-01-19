package info.phuphan.springboot.exceptionhandling.data;

import info.phuphan.springboot.exceptionhandling.bird.BirdObjectMother;
import info.phuphan.springboot.exceptionhandling.bird.BirdRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SampleData {

    private BirdRepository birdRepository;

    void createSampleData() {
        birdRepository.save(BirdObjectMother.createCanary());
    }
}
