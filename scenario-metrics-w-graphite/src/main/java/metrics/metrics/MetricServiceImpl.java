package io.lombocska.metrics.metrics;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class MetricServiceImpl implements MetricService {

    private MeterRegistry meterRegistry;
    private Counter animalGetQueriesCounter;

    public MetricServiceImpl(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.animalGetQueriesCounter = Counter.builder("app.animal.get.queries").register(meterRegistry);
    }

    @Override
    public void countAnimalGetQueries() {
        this.animalGetQueriesCounter.increment();
    }
}
